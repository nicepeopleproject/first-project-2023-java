package org.example.homework.hw4_bankaccount;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Homework 4: Bank Account Tests")
class BankAccountTest {

    @Test
    @DisplayName("Создание счета с корректными параметрами")
    void testCreateAccount() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertEquals("12345", account.getAccountNumber());
        assertEquals(1000.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Создание счета с нулевым балансом")
    void testCreateAccountZeroBalance() {
        BankAccount account = new BankAccount("12345", 0.0);
        assertEquals(0.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Создание счета с отрицательным балансом выбрасывает исключение")
    void testCreateAccountNegativeBalance() {
        assertThrows(IllegalArgumentException.class,
            () -> new BankAccount("12345", -100.0));
    }

    @Test
    @DisplayName("Создание счета с null номером выбрасывает исключение")
    void testCreateAccountNullNumber() {
        assertThrows(IllegalArgumentException.class,
            () -> new BankAccount(null, 1000.0));
    }

    @Test
    @DisplayName("Создание счета с пустым номером выбрасывает исключение")
    void testCreateAccountEmptyNumber() {
        assertThrows(IllegalArgumentException.class,
            () -> new BankAccount("", 1000.0));
    }

    @Test
    @DisplayName("Пополнение счета")
    void testDeposit() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Множественное пополнение счета")
    void testMultipleDeposits() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500.0);
        account.deposit(300.0);
        assertEquals(1800.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Пополнение отрицательной суммой выбрасывает исключение")
    void testDepositNegative() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100.0));
    }

    @Test
    @DisplayName("Пополнение нулевой суммой выбрасывает исключение")
    void testDepositZero() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0.0));
    }

    @Test
    @DisplayName("Снятие денег со счета")
    void testWithdraw() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Снятие всех денег со счета")
    void testWithdrawAll() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.withdraw(1000.0);
        assertEquals(0.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Снятие суммы больше баланса выбрасывает исключение")
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertThrows(IllegalStateException.class, () -> account.withdraw(1500.0));
    }

    @Test
    @DisplayName("Снятие отрицательной суммы выбрасывает исключение")
    void testWithdrawNegative() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100.0));
    }

    @Test
    @DisplayName("Перевод денег между счетами")
    void testTransfer() {
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        account1.transfer(account2, 300.0);

        assertEquals(700.0, account1.getBalance(), 0.01);
        assertEquals(800.0, account2.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Перевод всех денег")
    void testTransferAll() {
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        account1.transfer(account2, 1000.0);

        assertEquals(0.0, account1.getBalance(), 0.01);
        assertEquals(1500.0, account2.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Перевод суммы больше баланса выбрасывает исключение")
    void testTransferInsufficientFunds() {
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        assertThrows(IllegalStateException.class,
            () -> account1.transfer(account2, 1500.0));
    }

    @Test
    @DisplayName("Перевод на null счет выбрасывает исключение")
    void testTransferToNull() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertThrows(IllegalArgumentException.class,
            () -> account.transfer(null, 100.0));
    }

    @Test
    @DisplayName("Перевод отрицательной суммы выбрасывает исключение")
    void testTransferNegative() {
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        assertThrows(IllegalArgumentException.class,
            () -> account1.transfer(account2, -100.0));
    }
}
