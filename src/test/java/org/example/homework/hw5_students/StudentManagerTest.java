package org.example.homework.hw5_students;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Homework 5: Student Management Tests")
class StudentManagerTest {

    private StudentManager manager;
    private Student student1;
    private Student student2;
    private Student student3;

    @BeforeEach
    void setUp() {
        manager = new StudentManager();
        student1 = new Student("S001", "Иван Иванов", 20, 4.5);
        student2 = new Student("S002", "Мария Петрова", 22, 4.8);
        student3 = new Student("S003", "Алексей Сидоров", 19, 3.9);
    }

    @Test
    @DisplayName("Создание студента с корректными параметрами")
    void testCreateStudent() {
        assertEquals("S001", student1.getId());
        assertEquals("Иван Иванов", student1.getName());
        assertEquals(20, student1.getAge());
        assertEquals(4.5, student1.getGpa(), 0.01);
    }

    @Test
    @DisplayName("Создание студента с некорректным GPA выбрасывает исключение")
    void testCreateStudentInvalidGpa() {
        assertThrows(IllegalArgumentException.class,
            () -> new Student("S004", "Тест", 20, 6.0));
    }

    @Test
    @DisplayName("Изменение GPA студента")
    void testSetGpa() {
        student1.setGpa(4.7);
        assertEquals(4.7, student1.getGpa(), 0.01);
    }

    @Test
    @DisplayName("Добавление студента")
    void testAddStudent() {
        manager.addStudent(student1);
        assertEquals(1, manager.getStudentCount());
    }

    @Test
    @DisplayName("Добавление нескольких студентов")
    void testAddMultipleStudents() {
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);
        assertEquals(3, manager.getStudentCount());
    }

    @Test
    @DisplayName("Добавление дубликата студента выбрасывает исключение")
    void testAddDuplicateStudent() {
        manager.addStudent(student1);
        assertThrows(IllegalArgumentException.class,
            () -> manager.addStudent(new Student("S001", "Другое Имя", 25, 4.0)));
    }

    @Test
    @DisplayName("Добавление null студента выбрасывает исключение")
    void testAddNullStudent() {
        assertThrows(IllegalArgumentException.class, () -> manager.addStudent(null));
    }

    @Test
    @DisplayName("Поиск студента по ID")
    void testFindStudentById() {
        manager.addStudent(student1);
        manager.addStudent(student2);

        Student found = manager.findStudentById("S001");
        assertNotNull(found);
        assertEquals("Иван Иванов", found.getName());
    }

    @Test
    @DisplayName("Поиск несуществующего студента возвращает null")
    void testFindNonExistentStudent() {
        manager.addStudent(student1);
        Student found = manager.findStudentById("S999");
        assertNull(found);
    }

    @Test
    @DisplayName("Удаление студента")
    void testRemoveStudent() {
        manager.addStudent(student1);
        manager.addStudent(student2);

        boolean removed = manager.removeStudent("S001");
        assertTrue(removed);
        assertEquals(1, manager.getStudentCount());
        assertNull(manager.findStudentById("S001"));
    }

    @Test
    @DisplayName("Удаление несуществующего студента возвращает false")
    void testRemoveNonExistentStudent() {
        manager.addStudent(student1);
        boolean removed = manager.removeStudent("S999");
        assertFalse(removed);
        assertEquals(1, manager.getStudentCount());
    }

    @Test
    @DisplayName("Получение студентов старше заданного возраста")
    void testGetStudentsOlderThan() {
        manager.addStudent(student1); // 20 лет
        manager.addStudent(student2); // 22 года
        manager.addStudent(student3); // 19 лет

        List<Student> olderStudents = manager.getStudentsOlderThan(20);
        assertEquals(1, olderStudents.size());
        assertEquals("Мария Петрова", olderStudents.get(0).getName());
    }

    @Test
    @DisplayName("Получение студентов старше возраста - пустой результат")
    void testGetStudentsOlderThanNoResults() {
        manager.addStudent(student1); // 20 лет
        manager.addStudent(student3); // 19 лет

        List<Student> olderStudents = manager.getStudentsOlderThan(25);
        assertTrue(olderStudents.isEmpty());
    }

    @Test
    @DisplayName("Вычисление среднего GPA")
    void testCalculateAverageGpa() {
        manager.addStudent(student1); // 4.5
        manager.addStudent(student2); // 4.8
        manager.addStudent(student3); // 3.9

        double average = manager.calculateAverageGpa();
        assertEquals(4.4, average, 0.01); // (4.5 + 4.8 + 3.9) / 3 = 4.4
    }

    @Test
    @DisplayName("Вычисление среднего GPA - нет студентов")
    void testCalculateAverageGpaNoStudents() {
        double average = manager.calculateAverageGpa();
        assertEquals(0.0, average, 0.01);
    }

    @Test
    @DisplayName("Поиск лучшего студента")
    void testFindTopStudent() {
        manager.addStudent(student1); // GPA 4.5
        manager.addStudent(student2); // GPA 4.8
        manager.addStudent(student3); // GPA 3.9

        Student topStudent = manager.findTopStudent();
        assertNotNull(topStudent);
        assertEquals("Мария Петрова", topStudent.getName());
        assertEquals(4.8, topStudent.getGpa(), 0.01);
    }

    @Test
    @DisplayName("Поиск лучшего студента - нет студентов")
    void testFindTopStudentNoStudents() {
        Student topStudent = manager.findTopStudent();
        assertNull(topStudent);
    }

    @Test
    @DisplayName("Получение всех студентов")
    void testGetAllStudents() {
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        List<Student> allStudents = manager.getAllStudents();
        assertEquals(3, allStudents.size());
    }

    @Test
    @DisplayName("Изменение возвращенного списка не влияет на оригинальный")
    void testGetAllStudentsReturnsACopy() {
        manager.addStudent(student1);

        List<Student> allStudents = manager.getAllStudents();
        allStudents.clear();

        assertEquals(1, manager.getStudentCount());
    }
}
