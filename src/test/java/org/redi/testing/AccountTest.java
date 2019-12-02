package org.redi.testing;
import org.junit.Test;
import static org.junit.Assert.*;


public class AccountTest {
    @Test
    public void initialBalanceZero() {
        Account initialBalance = new Account("heba");
        assertSame(0,initialBalance.getBalance());

    }
    @Test
    public void initialHolderName(){
        String name ="heba";
        Account initialHolderName = new Account(name);
        assertSame(name,initialHolderName.getHolderName());

        String newName = "Sumaia";
        initialHolderName.setHolderName(newName);
        assertSame(newName,initialHolderName.getHolderName());
    }



}
