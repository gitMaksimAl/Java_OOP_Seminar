package Homework_5.Model;

import java.util.Random;

public class User {
    private String name;
    private String lastName;
    private int passwd;
    private int balance;
    private int account;
    private Random rn = new Random();

    public User(String name, String lastName, String password) {
        this.name = name;
        this.lastName = lastName;
        this.passwd = setPassword(password);
        this.account = rn.nextInt(Integer.MAX_VALUE / 2) + this.passwd;
    }

    private int setPassword(String password) {
        char[] passwd = password.toCharArray();
        int hash = 0;
        for (int i = 0; i < passwd.length; i++) hash += (int)passwd[i];
        return hash / passwd.length;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBalance() {
        return balance;
    }

    public int getPasswd() {
        return passwd;
    }

    public int getAccount() {
        return account;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User target = (User)obj;
        return (this.name.equals(target.name)
            && this.lastName.equals(target.lastName)
            && this.account == target.getAccount()
        );
    }

    @Override
    public String toString() {
        return String.format("User{name='%s', lastname='%s'}",
            getName(),
            getLastName()
        );
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
