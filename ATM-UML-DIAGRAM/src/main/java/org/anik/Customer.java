package org.anik;

public class Customer extends ATM{
    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus status;
    private Card card;
    private Account account;

    public Customer() {
    }

    public Customer(String name, String email, String phone, Address address, CustomerStatus status, Card card, Account account) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.card = card;
        this.account = account;
    }

    public boolean makeTransaction() {
        return false;
    }
}
