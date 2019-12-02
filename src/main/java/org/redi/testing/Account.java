package org.redi.testing;

public class Account {
   private String name;
   private Integer balance;

    public Account(String holderName) {
        this.balance = 0;
        this.name=holderName;
    }


    public Integer getBalance() {
        return this.balance;
    }

    public String getHolderName() {
        return name;
    }

    public void setHolderName(String holderName) {
        this.name = holderName;
    }
}
