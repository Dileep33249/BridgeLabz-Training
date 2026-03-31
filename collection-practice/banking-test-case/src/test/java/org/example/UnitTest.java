package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    public void Test_Deposit_ValidAmount() throws Exception {
        Program account = new Program(1000.0);

        account.deposit(500.0);

        assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void Test_Deposit_NegativeAmount() {
        Program account = new Program(1000.0);
        String actualMessage = "";

        try {
            account.deposit(-200.0);
        } catch (Exception e) {
            actualMessage = e.getMessage();
        }

        assertEquals("Deposit amount cannot be negative", actualMessage);
    }

    @Test
    public void Test_Withdraw_ValidAmount() throws Exception {
        Program account = new Program(1000.0);

        account.withdraw(400.0);

        assertEquals(600.0, account.getBalance());
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
        Program account = new Program(500.0);
        String actualMessage = "";

        try {
            account.withdraw(800.0);
        } catch (Exception e) {
            actualMessage = e.getMessage();
        }

        assertEquals("Insufficient funds", actualMessage);
    }
}
