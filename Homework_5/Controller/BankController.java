package Homework_5.Controller;

import Homework_5.Model.User;
import Homework_5.Service.ServicesImpl;

public class BankController {
    private ServicesImpl bankService = new ServicesImpl();

    public boolean validate(User user, String password) {
        if (user == null) return false;
        char[] passwd = password.toCharArray();
        int hash = 0;
        for (int i = 0; i < passwd.length; i++) hash += (int)passwd[i];
        if (user != null && user.getPasswd() == hash / passwd.length) return true;
        else return false;
    }

    public User authorization(String name, String lastName) {
        return bankService.getUser(name, lastName);
    }

    public boolean addAccount(User user) {
        return bankService.addUser(user);
    }

    public boolean delAccount(User user, String passwd) {
        if (validate(user, passwd)) return bankService.delUser(user);
        else return false;
    }

    public boolean takeMoney(User user, String passwd, int withdrawal) {
        if (validate(user, passwd)) {
            bankService.takeMoney(user, withdrawal);
            return true;
        } else return false;
    }

    public boolean addMoney(User user, String passwd, int deposit) {
        if (validate(user, passwd)) {
            bankService.addMoney(user, deposit);
            return true;
        } else return false;
    }

    public String getInfo(User user, String passwd) {
        if (!(validate(user, passwd))) return "Wrong login or password.";
        System.out.println("\033[H\033[2J\n--------Bank Online-------\n");
        return String.format("%s\t%s\n%d............%d\u20BD",
            user.getLastName(),
            user.getName(),
            user.getAccount(),
            user.getBalance()
        );
    }
}
