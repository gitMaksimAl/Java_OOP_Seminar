package Homework_5.Service;

import Homework_5.Model.User;

public interface BankService {
    void addMoney(User user, int deposit);
    void takeMoney(User user, int withdrawal);
    String getBalance(User user);
    String getClients();
}
