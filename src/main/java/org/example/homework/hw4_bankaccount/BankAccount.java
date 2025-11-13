package org.example.homework.hw4_bankaccount;

/**
 * Домашнее задание 4: Объектно-ориентированное программирование - Банковский счет
 *
 * Реализуйте класс банковского счета с базовыми операциями.
 *
 * Задания:
 * 1. Создайте конструктор, который принимает номер счета и начальный баланс
 * 2. Реализуйте метод deposit() для пополнения счета
 * 3. Реализуйте метод withdraw() для снятия денег
 * 4. Реализуйте метод transfer() для перевода денег на другой счет
 * 5. Добавьте геттеры для номера счета и баланса
 * 6. Обеспечьте валидацию (отрицательные суммы, недостаточный баланс и т.д.)
 */
public class BankAccount {

    private String accountNumber;
    private double balance;

    /**
     * Конструктор банковского счета
     * @param accountNumber номер счета
     * @param initialBalance начальный баланс
     * @throws IllegalArgumentException если номер счета null/пустой или начальный баланс отрицательный
     */
    public BankAccount(String accountNumber, double initialBalance) {
        // TODO: Реализуйте конструктор
        // Подсказка: проверьте, что accountNumber не null и не пустой
        // Подсказка: проверьте, что initialBalance >= 0
        throw new UnsupportedOperationException("Конструктор BankAccount() не реализован");
    }

    /**
     * Возвращает номер счета
     * @return номер счета
     */
    public String getAccountNumber() {
        // TODO: Реализуйте метод
        throw new UnsupportedOperationException("Метод getAccountNumber() не реализован");
    }

    /**
     * Возвращает текущий баланс
     * @return баланс счета
     */
    public double getBalance() {
        // TODO: Реализуйте метод
        throw new UnsupportedOperationException("Метод getBalance() не реализован");
    }

    /**
     * Пополняет счет на указанную сумму
     * @param amount сумма пополнения
     * @throws IllegalArgumentException если сумма <= 0
     */
    public void deposit(double amount) {
        // TODO: Реализуйте метод
        // Подсказка: проверьте, что amount > 0
        throw new UnsupportedOperationException("Метод deposit() не реализован");
    }

    /**
     * Снимает указанную сумму со счета
     * @param amount сумма для снятия
     * @throws IllegalArgumentException если сумма <= 0
     * @throws IllegalStateException если недостаточно средств на счете
     */
    public void withdraw(double amount) {
        // TODO: Реализуйте метод
        // Подсказка: проверьте, что amount > 0
        // Подсказка: проверьте, что balance >= amount
        throw new UnsupportedOperationException("Метод withdraw() не реализован");
    }

    /**
     * Переводит деньги на другой счет
     * @param targetAccount счет получателя
     * @param amount сумма перевода
     * @throws IllegalArgumentException если targetAccount null или amount <= 0
     * @throws IllegalStateException если недостаточно средств на счете
     */
    public void transfer(BankAccount targetAccount, double amount) {
        // TODO: Реализуйте метод
        // Подсказка: проверьте, что targetAccount не null
        // Подсказка: используйте методы withdraw() и deposit()
        throw new UnsupportedOperationException("Метод transfer() не реализован");
    }
}
