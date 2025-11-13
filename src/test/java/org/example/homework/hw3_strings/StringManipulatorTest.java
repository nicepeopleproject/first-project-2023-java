package org.example.homework.hw3_strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Homework 3: String Manipulation Tests")
class StringManipulatorTest {

    private StringManipulator manipulator;

    @BeforeEach
    void setUp() {
        manipulator = new StringManipulator();
    }

    @Test
    @DisplayName("Палиндром: 'radar' -> true")
    void testIsPalindromeSimple() {
        assertTrue(manipulator.isPalindrome("radar"));
    }

    @Test
    @DisplayName("Палиндром: 'A man a plan a canal Panama' -> true")
    void testIsPalindromeWithSpaces() {
        assertTrue(manipulator.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    @DisplayName("Не палиндром: 'hello' -> false")
    void testIsNotPalindrome() {
        assertFalse(manipulator.isPalindrome("hello"));
    }

    @Test
    @DisplayName("Палиндром: пустая строка -> true")
    void testIsPalindromeEmpty() {
        assertTrue(manipulator.isPalindrome(""));
    }

    @Test
    @DisplayName("Палиндром: null выбрасывает исключение")
    void testIsPalindromeNull() {
        assertThrows(IllegalArgumentException.class, () -> manipulator.isPalindrome(null));
    }

    @Test
    @DisplayName("Подсчет гласных: 'Hello World' -> 3")
    void testCountVowels() {
        assertEquals(3, manipulator.countVowels("Hello World"));
    }

    @Test
    @DisplayName("Подсчет гласных: 'Java Programming' -> 5")
    void testCountVowelsMultiple() {
        assertEquals(5, manipulator.countVowels("Java Programming"));
    }

    @Test
    @DisplayName("Подсчет гласных: 'bcdfg' -> 0")
    void testCountVowelsNone() {
        assertEquals(0, manipulator.countVowels("bcdfg"));
    }

    @Test
    @DisplayName("Подсчет гласных: пустая строка -> 0")
    void testCountVowelsEmpty() {
        assertEquals(0, manipulator.countVowels(""));
    }

    @Test
    @DisplayName("Переворот строки: 'Hello' -> 'olleH'")
    void testReverse() {
        assertEquals("olleH", manipulator.reverse("Hello"));
    }

    @Test
    @DisplayName("Переворот строки: 'Java' -> 'avaJ'")
    void testReverseJava() {
        assertEquals("avaJ", manipulator.reverse("Java"));
    }

    @Test
    @DisplayName("Переворот строки: пустая строка -> пустая строка")
    void testReverseEmpty() {
        assertEquals("", manipulator.reverse(""));
    }

    @Test
    @DisplayName("Подсчет слов: 'Hello World' -> 2")
    void testCountWords() {
        assertEquals(2, manipulator.countWords("Hello World"));
    }

    @Test
    @DisplayName("Подсчет слов: 'Java  is   great' -> 3")
    void testCountWordsMultipleSpaces() {
        assertEquals(3, manipulator.countWords("Java  is   great"));
    }

    @Test
    @DisplayName("Подсчет слов: '   Hello   ' -> 1")
    void testCountWordsWithLeadingTrailingSpaces() {
        assertEquals(1, manipulator.countWords("   Hello   "));
    }

    @Test
    @DisplayName("Подсчет слов: пустая строка -> 0")
    void testCountWordsEmpty() {
        assertEquals(0, manipulator.countWords(""));
    }

    @Test
    @DisplayName("Подсчет слов: только пробелы -> 0")
    void testCountWordsOnlySpaces() {
        assertEquals(0, manipulator.countWords("     "));
    }

    @Test
    @DisplayName("Анаграммы: 'listen' и 'silent' -> true")
    void testAreAnagrams() {
        assertTrue(manipulator.areAnagrams("listen", "silent"));
    }

    @Test
    @DisplayName("Анаграммы: 'The Eyes' и 'They See' -> true")
    void testAreAnagramsWithSpaces() {
        assertTrue(manipulator.areAnagrams("The Eyes", "They See"));
    }

    @Test
    @DisplayName("Не анаграммы: 'hello' и 'world' -> false")
    void testAreNotAnagrams() {
        assertFalse(manipulator.areAnagrams("hello", "world"));
    }

    @Test
    @DisplayName("Анаграммы: разная длина -> false")
    void testAreAnagramsDifferentLength() {
        assertFalse(manipulator.areAnagrams("hello", "helloworld"));
    }

    @Test
    @DisplayName("Удаление пробелов: 'Hello World' -> 'HelloWorld'")
    void testRemoveSpaces() {
        assertEquals("HelloWorld", manipulator.removeSpaces("Hello World"));
    }

    @Test
    @DisplayName("Удаление пробелов: '  Java  Programming  ' -> 'JavaProgramming'")
    void testRemoveSpacesMultiple() {
        assertEquals("JavaProgramming", manipulator.removeSpaces("  Java  Programming  "));
    }

    @Test
    @DisplayName("Удаление пробелов: пустая строка -> пустая строка")
    void testRemoveSpacesEmpty() {
        assertEquals("", manipulator.removeSpaces(""));
    }
}
