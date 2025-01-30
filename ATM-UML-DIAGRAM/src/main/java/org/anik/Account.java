package org.anik;

public class Account {
    private int accountNumber;
    private double totalBalance;
    private double availableBalance;

    public int getAvailableBalance(){
        return (int)availableBalance;
    }
}
