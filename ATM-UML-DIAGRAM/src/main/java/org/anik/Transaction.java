package org.anik;

import java.util.Date;

public class Transaction extends Account{
    private int transactionId;
    private TransactionStatus status;
    private Date creationDate;

    public boolean saveTransaction() {
        return false;
    }
}
