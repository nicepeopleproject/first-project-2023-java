package org.example.homework.hw3_strings;

/**
 * Домашнее задание 3: Работа со строками
 *
 * Реализуйте методы для работы со строками.
 *
 * Задания:
 * 1. Проверьте, является ли строка палиндромом
 * 2. Подсчитайте количество гласных букв в строке
 * 3. Переверните строку
 * 4. Подсчитайте количество слов в строке
 * 5. Проверьте, является ли строка анаграммой другой строки
 * 6. Удалите все пробелы из строки
 */
public class StringManipulator {

    /**
     * Проверяет, является ли строка палиндромом (читается одинаково слева направо и справа налево)
     * Игнорирует регистр и пробелы.
     * Например: "А роза упала на лапу Азора" - палиндром
     * @param str строка для проверки
     * @return true если палиндром, false иначе
     * @throws IllegalArgumentException если строка null
     */
    public boolean isPalindrome(String str) {
        // TODO: Реализуйте метод
        // Подсказка: удалите пробелы, приведите к нижнему регистру,
        // сравните символы с начала и конца
        throw new UnsupportedOperationException("Метод isPalindrome() не реализован");
    }

    /**
     * Подсчитывает количество гласных букв в строке (a, e, i, o, u, а, е, ё, и, о, у, ы, э, ю, я)
     * @param str строка для анализа
     * @return количество гласных букв
     * @throws IllegalArgumentException если строка null
     */
    public int countVowels(String str) {
        // TODO: Реализуйте метод
        // Подсказка: используйте toLowerCase() и проверяйте каждый символ
        throw new UnsupportedOperationException("Метод countVowels() не реализован");
    }

    /**
     * Переворачивает строку
     * Например: "Hello" -> "olleH"
     * @param str строка для переворота
     * @return перевернутая строка
     * @throws IllegalArgumentException если строка null
     */
    public String reverse(String str) {
        // TODO: Реализуйте метод
        // Подсказка: можно использовать StringBuilder.reverse()
        throw new UnsupportedOperationException("Метод reverse() не реализован");
    }

    /**
     * Подсчитывает количество слов в строке
     * Слова разделены пробелами. Множественные пробелы считаются как один.
     * @param str строка для анализа
     * @return количество слов
     * @throws IllegalArgumentException если строка null
     */
    public int countWords(String str) {
        // TODO: Реализуйте метод
        // Подсказка: используйте метод split() с регулярным выражением "\\s+"
        throw new UnsupportedOperationException("Метод countWords() не реализован");
    }

    /**
     * Проверяет, являются ли две строки анаграммами
     * (содержат одинаковые буквы в разном порядке)
     * Игнорирует регистр и пробелы.
     * Например: "Listen" и "Silent" - анаграммы
     * @param str1 первая строка
     * @param str2 вторая строка
     * @return true если анаграммы, false иначе
     * @throws IllegalArgumentException если любая из строк null
     */
    public boolean areAnagrams(String str1, String str2) {
        // TODO: Реализуйте метод
        // Подсказка: удалите пробелы, приведите к нижнему регистру,
        // отсортируйте символы и сравните
        throw new UnsupportedOperationException("Метод areAnagrams() не реализован");
    }

    /**
     * Удаляет все пробелы из строки
     * @param str строка
     * @return строка без пробелов
     * @throws IllegalArgumentException если строка null
     */
    public String removeSpaces(String str) {
        // TODO: Реализуйте метод
        // Подсказка: используйте метод replaceAll()
        throw new UnsupportedOperationException("Метод removeSpaces() не реализован");
    }
}
