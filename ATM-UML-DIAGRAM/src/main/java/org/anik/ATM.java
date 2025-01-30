package org.anik;

public class ATM extends Bank{
    private int atmID;
    private Address address;
    private CashDispenser cashDispenser;
    private Keypad keypad;
    private Screen screen;
    private Printer printer;
    private CardReader cardReader;
    private DepositSlot depositSlot;

    public boolean authenticateUser(){
        return false;
    }
}
