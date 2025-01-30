package org.anik;

public enum TransactionStatus {
    SUCCESS(1),
    FAILURE(2),
    BLOCKED(3),
    FULL(4),
    PARTIAL(5),
    NONE(6);

    private final int value;

    private TransactionStatus(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
