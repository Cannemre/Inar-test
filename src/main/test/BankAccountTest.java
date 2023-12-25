package main.test;

import main.java.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount account = new BankAccount(1000);

    @Test
    void depositIntoAccount() {
        account.deposit(100);
        double result = account.getBalance();
        assertEquals(1100, result);
    }

    @Test
    void withdrawFromAccountWithSufficientFunds() {
        account.withdraw(100);
        double result = account.getBalance();
        assertEquals(900, result);
    }

    @Test
    void withdrawFromAccountExceedingBalance() {
        try {
            account.withdraw(2000);
        } catch (IllegalArgumentException exception) {
            assertEquals("Insufficient funds", exception.getMessage());
        }

    }

    @Test
    void depositNegativeAmount() {
        account.deposit(-10);
    }

    @Test
    void withdrawNegativeAmount() {
        account.withdraw(-10);
    }
}