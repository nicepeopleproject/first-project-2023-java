package org.example.homework.hw5_students;

import java.util.ArrayList;
import java.util.List;

/**
 * Домашнее задание 5: Работа с коллекциями - Управление студентами
 *
 * Реализуйте систему управления студентами с использованием коллекций.
 *
 * Задания:
 * 1. Добавление студента в список
 * 2. Удаление студента по ID
 * 3. Поиск студента по ID
 * 4. Получение всех студентов старше заданного возраста
 * 5. Вычисление среднего GPA всех студентов
 * 6. Поиск студента с максимальным GPA
 */
public class StudentManager {

    private List<Student> students;

    /**
     * Конструктор менеджера студентов
     */
    public StudentManager() {
        // TODO: Инициализируйте список студентов
        throw new UnsupportedOperationException("Конструктор StudentManager() не реализован");
    }

    /**
     * Добавляет студента в список
     * @param student студент для добавления
     * @throws IllegalArgumentException если student null или студент с таким ID уже существует
     */
    public void addStudent(Student student) {
        // TODO: Реализуйте метод
        // Подсказка: проверьте, что student не null
        // Подсказка: проверьте, что студента с таким ID еще нет в списке
        throw new UnsupportedOperationException("Метод addStudent() не реализован");
    }

    /**
     * Удаляет студента по ID
     * @param id идентификатор студента
     * @return true если студент был удален, false если студент не найден
     * @throws IllegalArgumentException если id null
     */
    public boolean removeStudent(String id) {
        // TODO: Реализуйте метод
        // Подсказка: используйте метод removeIf() или итератор
        throw new UnsupportedOperationException("Метод removeStudent() не реализован");
    }

    /**
     * Находит студента по ID
     * @param id идентификатор студента
     * @return студент или null, если не найден
     * @throws IllegalArgumentException если id null
     */
    public Student findStudentById(String id) {
        // TODO: Реализуйте метод
        // Подсказка: используйте цикл или stream API
        throw new UnsupportedOperationException("Метод findStudentById() не реализован");
    }

    /**
     * Получает список всех студентов старше заданного возраста
     * @param age минимальный возраст
     * @return список студентов старше указанного возраста
     * @throws IllegalArgumentException если age <= 0
     */
    public List<Student> getStudentsOlderThan(int age) {
        // TODO: Реализуйте метод
        // Подсказка: используйте цикл или stream API с filter
        throw new UnsupportedOperationException("Метод getStudentsOlderThan() не реализован");
    }

    /**
     * Вычисляет средний GPA всех студентов
     * @return средний GPA или 0.0 если студентов нет
     */
    public double calculateAverageGpa() {
        // TODO: Реализуйте метод
        // Подсказка: если студентов нет, верните 0.0
        throw new UnsupportedOperationException("Метод calculateAverageGpa() не реализован");
    }

    /**
     * Находит студента с максимальным GPA
     * @return студент с максимальным GPA или null, если студентов нет
     */
    public Student findTopStudent() {
        // TODO: Реализуйте метод
        // Подсказка: используйте цикл или stream API с max
        throw new UnsupportedOperationException("Метод findTopStudent() не реализован");
    }

    /**
     * Возвращает количество студентов
     * @return количество студентов в списке
     */
    public int getStudentCount() {
        // TODO: Реализуйте метод
        throw new UnsupportedOperationException("Метод getStudentCount() не реализован");
    }

    /**
     * Возвращает копию списка всех студентов
     * @return список всех студентов
     */
    public List<Student> getAllStudents() {
        // TODO: Реализуйте метод
        // Подсказка: верните новый ArrayList с копией списка
        throw new UnsupportedOperationException("Метод getAllStudents() не реализован");
    }
}
