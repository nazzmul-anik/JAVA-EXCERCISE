package org.anik;

public enum TransactionType {
    BALANCE_INQUIRY(1),
    DEPOSIT_CASH(2),
    DEPOSIT_CHECK(3),
    WITHDRAW(4),
    TRANSFER(5);

    private final int value;

    private TransactionType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
