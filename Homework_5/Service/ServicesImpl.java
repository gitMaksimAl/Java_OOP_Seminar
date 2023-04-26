package Homework_5.Service;

import Homework_5.Model.User;
import Homework_5.Repository.UserDataBase;

public class ServicesImpl implements UserService, BankService {
    private UserDataBase dBase = new UserDataBase();

    @Override
    public void addMoney(User user, int deposit) {
        int money = user.getBalance();
        user.setBalance(money + deposit);
    }

    @Override
    public void takeMoney(User user, int withdrawal) {
        int money = user.getBalance();
        user.setBalance(money - withdrawal);
    }

    @Override
    public String getBalance(User user) {
        return String.format("%d\t\t%d", user.getAccount(), user.getBalance());
    }

    @Override
    public boolean addUser(User user) {
        if (user == null || dBase.userExist(user)) return false;
        else {
            dBase.addUser(user);
            return true;
        }
    }

    @Override
    public boolean delUser(User user) {
        if (user == null) {
            System.err.println("User is null.");
            return false;
        } else return dBase.delUser(user);
    }

    @Override
    public User getUser(String name, String lastName) {
        return dBase.getUser(name, lastName);
    }

    @Override
    public String getClients() {
        return dBase.getInfo();
    }
    
}
