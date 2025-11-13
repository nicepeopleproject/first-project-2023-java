package org.example.homework.hw2_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Homework 2: Array Operations Tests")
class ArrayOperationsTest {

    private ArrayOperations arrayOps;

    @BeforeEach
    void setUp() {
        arrayOps = new ArrayOperations();
    }

    @Test
    @DisplayName("Поиск максимума: [1, 5, 3, 9, 2] -> 9")
    void testFindMax() {
        int[] array = {1, 5, 3, 9, 2};
        assertEquals(9, arrayOps.findMax(array));
    }

    @Test
    @DisplayName("Поиск максимума: [-5, -1, -10] -> -1")
    void testFindMaxNegative() {
        int[] array = {-5, -1, -10};
        assertEquals(-1, arrayOps.findMax(array));
    }

    @Test
    @DisplayName("Поиск максимума: пустой массив выбрасывает исключение")
    void testFindMaxEmptyArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> arrayOps.findMax(array));
    }

    @Test
    @DisplayName("Поиск максимума: null выбрасывает исключение")
    void testFindMaxNull() {
        assertThrows(IllegalArgumentException.class, () -> arrayOps.findMax(null));
    }

    @Test
    @DisplayName("Поиск минимума: [1, 5, 3, 9, 2] -> 1")
    void testFindMin() {
        int[] array = {1, 5, 3, 9, 2};
        assertEquals(1, arrayOps.findMin(array));
    }

    @Test
    @DisplayName("Поиск минимума: [-5, -1, -10] -> -10")
    void testFindMinNegative() {
        int[] array = {-5, -1, -10};
        assertEquals(-10, arrayOps.findMin(array));
    }

    @Test
    @DisplayName("Сумма: [1, 2, 3, 4, 5] -> 15")
    void testSum() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(15, arrayOps.sum(array));
    }

    @Test
    @DisplayName("Сумма: пустой массив -> 0")
    void testSumEmptyArray() {
        int[] array = {};
        assertEquals(0, arrayOps.sum(array));
    }

    @Test
    @DisplayName("Сумма: null выбрасывает исключение")
    void testSumNull() {
        assertThrows(IllegalArgumentException.class, () -> arrayOps.sum(null));
    }

    @Test
    @DisplayName("Среднее: [2, 4, 6, 8] -> 5.0")
    void testAverage() {
        int[] array = {2, 4, 6, 8};
        assertEquals(5.0, arrayOps.average(array), 0.0001);
    }

    @Test
    @DisplayName("Среднее: [1, 2, 3] -> 2.0")
    void testAverageOdd() {
        int[] array = {1, 2, 3};
        assertEquals(2.0, arrayOps.average(array), 0.0001);
    }

    @Test
    @DisplayName("Среднее: пустой массив выбрасывает исключение")
    void testAverageEmptyArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> arrayOps.average(array));
    }

    @Test
    @DisplayName("Переворот: [1, 2, 3, 4] -> [4, 3, 2, 1]")
    void testReverse() {
        int[] array = {1, 2, 3, 4};
        arrayOps.reverse(array);
        assertArrayEquals(new int[]{4, 3, 2, 1}, array);
    }

    @Test
    @DisplayName("Переворот: [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]")
    void testReverseOdd() {
        int[] array = {1, 2, 3, 4, 5};
        arrayOps.reverse(array);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, array);
    }

    @Test
    @DisplayName("Переворот: [1] -> [1]")
    void testReverseSingleElement() {
        int[] array = {1};
        arrayOps.reverse(array);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    @DisplayName("Поиск индекса: [10, 20, 30, 40], элемент 30 -> 2")
    void testIndexOf() {
        int[] array = {10, 20, 30, 40};
        assertEquals(2, arrayOps.indexOf(array, 30));
    }

    @Test
    @DisplayName("Поиск индекса: элемент не найден -> -1")
    void testIndexOfNotFound() {
        int[] array = {10, 20, 30, 40};
        assertEquals(-1, arrayOps.indexOf(array, 50));
    }

    @Test
    @DisplayName("Поиск индекса: первое вхождение дубликата")
    void testIndexOfDuplicate() {
        int[] array = {10, 20, 30, 20, 40};
        assertEquals(1, arrayOps.indexOf(array, 20));
    }
}
