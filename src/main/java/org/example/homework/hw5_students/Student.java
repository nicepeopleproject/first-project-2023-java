package org.example.homework.hw5_students;

import java.util.Objects;

/**
 * Класс, представляющий студента
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private double gpa; // Grade Point Average - средний балл

    /**
     * Конструктор студента
     * @param id уникальный идентификатор
     * @param name имя студента
     * @param age возраст
     * @param gpa средний балл (0.0 - 5.0)
     * @throws IllegalArgumentException если параметры некорректны
     */
    public Student(String id, String name, int age, double gpa) {
        // TODO: Реализуйте конструктор
        // Подсказка: проверьте, что id и name не null и не пустые
        // Подсказка: проверьте, что age > 0 и gpa между 0.0 и 5.0
        throw new UnsupportedOperationException("Конструктор Student() не реализован");
    }

    public String getId() {
        // TODO: Реализуйте метод
        throw new UnsupportedOperationException("Метод getId() не реализован");
    }

    public String getName() {
        // TODO: Реализуйте метод
        throw new UnsupportedOperationException("Метод getName() не реализован");
    }

    public int getAge() {
        // TODO: Реализуйте метод
        throw new UnsupportedOperationException("Метод getAge() не реализован");
    }

    public double getGpa() {
        // TODO: Реализуйте метод
        throw new UnsupportedOperationException("Метод getGpa() не реализован");
    }

    public void setGpa(double gpa) {
        // TODO: Реализуйте метод
        // Подсказка: проверьте, что gpa между 0.0 и 5.0
        throw new UnsupportedOperationException("Метод setGpa() не реализован");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}
