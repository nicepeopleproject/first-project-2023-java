package org.example.homework.hw1_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Homework 1: Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Сложение: 5 + 3 = 8")
    void testAddPositiveNumbers() {
        assertEquals(8.0, calculator.add(5, 3), 0.0001);
    }

    @Test
    @DisplayName("Сложение: -5 + 3 = -2")
    void testAddNegativeNumbers() {
        assertEquals(-2.0, calculator.add(-5, 3), 0.0001);
    }

    @Test
    @DisplayName("Сложение: 0 + 0 = 0")
    void testAddZeros() {
        assertEquals(0.0, calculator.add(0, 0), 0.0001);
    }

    @Test
    @DisplayName("Вычитание: 10 - 3 = 7")
    void testSubtractPositiveNumbers() {
        assertEquals(7.0, calculator.subtract(10, 3), 0.0001);
    }

    @Test
    @DisplayName("Вычитание: 3 - 10 = -7")
    void testSubtractResultNegative() {
        assertEquals(-7.0, calculator.subtract(3, 10), 0.0001);
    }

    @Test
    @DisplayName("Умножение: 4 * 5 = 20")
    void testMultiplyPositiveNumbers() {
        assertEquals(20.0, calculator.multiply(4, 5), 0.0001);
    }

    @Test
    @DisplayName("Умножение: -4 * 5 = -20")
    void testMultiplyNegativeNumber() {
        assertEquals(-20.0, calculator.multiply(-4, 5), 0.0001);
    }

    @Test
    @DisplayName("Умножение: 0 * 100 = 0")
    void testMultiplyByZero() {
        assertEquals(0.0, calculator.multiply(0, 100), 0.0001);
    }

    @Test
    @DisplayName("Деление: 10 / 2 = 5")
    void testDividePositiveNumbers() {
        assertEquals(5.0, calculator.divide(10, 2), 0.0001);
    }

    @Test
    @DisplayName("Деление: 7 / 2 = 3.5")
    void testDivideWithDecimals() {
        assertEquals(3.5, calculator.divide(7, 2), 0.0001);
    }

    @Test
    @DisplayName("Деление на ноль должно выбросить исключение")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    @Test
    @DisplayName("Возведение в степень: 2^3 = 8")
    void testPower() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }

    @Test
    @DisplayName("Возведение в степень: 5^0 = 1")
    void testPowerZeroExponent() {
        assertEquals(1.0, calculator.power(5, 0), 0.0001);
    }

    @Test
    @DisplayName("Возведение в степень: 2^-2 = 0.25")
    void testPowerNegativeExponent() {
        assertEquals(0.25, calculator.power(2, -2), 0.0001);
    }

    @Test
    @DisplayName("Квадратный корень: sqrt(16) = 4")
    void testSqrt() {
        assertEquals(4.0, calculator.sqrt(16), 0.0001);
    }

    @Test
    @DisplayName("Квадратный корень: sqrt(0) = 0")
    void testSqrtZero() {
        assertEquals(0.0, calculator.sqrt(0), 0.0001);
    }

    @Test
    @DisplayName("Квадратный корень из отрицательного числа должен выбросить исключение")
    void testSqrtNegative() {
        assertThrows(ArithmeticException.class, () -> calculator.sqrt(-1));
    }
}
