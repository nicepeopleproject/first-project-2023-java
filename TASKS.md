# Список домашних заданий

## 📋 Быстрый старт

Каждое задание содержит методы с комментарием `// TODO: Реализуйте метод`. Замените строку:
```java
throw new UnsupportedOperationException("Метод не реализован");
```
на вашу реализацию и запустите тесты.

---

## Homework 1: Calculator 🧮

**Файл:** `src/main/java/org/example/homework/hw1_calculator/Calculator.java`

| Метод | Описание | Сложность |
|-------|----------|-----------|
| `add(a, b)` | Сложение двух чисел | ⭐ |
| `subtract(a, b)` | Вычитание двух чисел | ⭐ |
| `multiply(a, b)` | Умножение двух чисел | ⭐ |
| `divide(a, b)` | Деление (обработка деления на 0) | ⭐⭐ |
| `power(base, exp)` | Возведение в степень | ⭐⭐ |
| `sqrt(a)` | Квадратный корень (проверка отрицательных) | ⭐⭐ |

**Тесты:** `mvn test -Dtest=CalculatorTest`

---

## Homework 2: Array Operations 📊

**Файл:** `src/main/java/org/example/homework/hw2_arrays/ArrayOperations.java`

| Метод | Описание | Сложность |
|-------|----------|-----------|
| `findMax(array)` | Найти максимальный элемент | ⭐⭐ |
| `findMin(array)` | Найти минимальный элемент | ⭐⭐ |
| `sum(array)` | Сумма всех элементов | ⭐ |
| `average(array)` | Среднее значение | ⭐⭐ |
| `reverse(array)` | Перевернуть массив | ⭐⭐ |
| `indexOf(array, element)` | Найти индекс элемента | ⭐⭐ |

**Тесты:** `mvn test -Dtest=ArrayOperationsTest`

---

## Homework 3: String Manipulation 🔤

**Файл:** `src/main/java/org/example/homework/hw3_strings/StringManipulator.java`

| Метод | Описание | Сложность |
|-------|----------|-----------|
| `isPalindrome(str)` | Проверка на палиндром | ⭐⭐⭐ |
| `countVowels(str)` | Подсчет гласных букв | ⭐⭐ |
| `reverse(str)` | Перевернуть строку | ⭐ |
| `countWords(str)` | Подсчет слов | ⭐⭐ |
| `areAnagrams(str1, str2)` | Проверка на анаграммы | ⭐⭐⭐ |
| `removeSpaces(str)` | Удалить все пробелы | ⭐ |

**Тесты:** `mvn test -Dtest=StringManipulatorTest`

---

## Homework 4: Bank Account 🏦

**Файл:** `src/main/java/org/example/homework/hw4_bankaccount/BankAccount.java`

| Метод/Элемент | Описание | Сложность |
|---------------|----------|-----------|
| `BankAccount(accountNumber, balance)` | Конструктор с валидацией | ⭐⭐ |
| `getAccountNumber()` | Получить номер счета | ⭐ |
| `getBalance()` | Получить баланс | ⭐ |
| `deposit(amount)` | Пополнить счет | ⭐⭐ |
| `withdraw(amount)` | Снять деньги | ⭐⭐⭐ |
| `transfer(targetAccount, amount)` | Перевести деньги | ⭐⭐⭐ |

**Особенности:**
- Валидация всех входных параметров
- Проверка достаточности средств
- Использование `IllegalArgumentException` и `IllegalStateException`

**Тесты:** `mvn test -Dtest=BankAccountTest`

---

## Homework 5: Student Management 👨‍🎓

**Файлы:**
- `src/main/java/org/example/homework/hw5_students/Student.java`
- `src/main/java/org/example/homework/hw5_students/StudentManager.java`

### Student.java

| Метод | Описание | Сложность |
|-------|----------|-----------|
| `Student(id, name, age, gpa)` | Конструктор с валидацией | ⭐⭐ |
| `getId()`, `getName()`, `getAge()`, `getGpa()` | Геттеры | ⭐ |
| `setGpa(gpa)` | Установить GPA с валидацией | ⭐⭐ |

### StudentManager.java

| Метод | Описание | Сложность |
|-------|----------|-----------|
| `StudentManager()` | Конструктор | ⭐ |
| `addStudent(student)` | Добавить студента | ⭐⭐ |
| `removeStudent(id)` | Удалить студента по ID | ⭐⭐ |
| `findStudentById(id)` | Найти студента | ⭐⭐ |
| `getStudentsOlderThan(age)` | Найти студентов старше возраста | ⭐⭐⭐ |
| `calculateAverageGpa()` | Средний GPA всех студентов | ⭐⭐⭐ |
| `findTopStudent()` | Найти лучшего студента | ⭐⭐⭐ |
| `getStudentCount()` | Количество студентов | ⭐ |
| `getAllStudents()` | Получить всех студентов | ⭐⭐ |

**Особенности:**
- Использование `ArrayList<Student>`
- Проверка на дубликаты при добавлении
- Работа с коллекциями и Stream API

**Тесты:** `mvn test -Dtest=StudentManagerTest`

---

## 🎯 Рекомендуемый порядок выполнения

1. **Homework 1** - базовые операции, знакомство с Java
2. **Homework 2** - работа с массивами и циклами
3. **Homework 3** - работа со строками и методами String
4. **Homework 4** - введение в ООП, инкапсуляция
5. **Homework 5** - коллекции, более сложная логика

---

## 📈 Прогресс

Отмечайте выполненные задания:

- [ ] Homework 1: Calculator
- [ ] Homework 2: Array Operations
- [ ] Homework 3: String Manipulation
- [ ] Homework 4: Bank Account
- [ ] Homework 5: Student Management

---

## 💡 Подсказки

### Homework 1
```java
// Деление на ноль
if (b == 0) {
    throw new ArithmeticException("Division by zero");
}

// Квадратный корень
if (a < 0) {
    throw new ArithmeticException("Cannot calculate square root of negative number");
}
return Math.sqrt(a);
```

### Homework 2
```java
// Проверка на null и пустоту
if (array == null) {
    throw new IllegalArgumentException("Array cannot be null");
}
if (array.length == 0) {
    throw new IllegalArgumentException("Array cannot be empty");
}

// Реверс массива
for (int i = 0; i < array.length / 2; i++) {
    int temp = array[i];
    array[i] = array[array.length - 1 - i];
    array[array.length - 1 - i] = temp;
}
```

### Homework 3
```java
// Удаление пробелов и приведение к нижнему регистру
String cleaned = str.replaceAll("\\s+", "").toLowerCase();

// Подсчет слов
if (str == null || str.trim().isEmpty()) {
    return 0;
}
return str.trim().split("\\s+").length;
```

### Homework 4
```java
// Валидация в конструкторе
if (accountNumber == null || accountNumber.isEmpty()) {
    throw new IllegalArgumentException("Account number cannot be null or empty");
}
if (initialBalance < 0) {
    throw new IllegalArgumentException("Initial balance cannot be negative");
}

// Проверка баланса
if (balance < amount) {
    throw new IllegalStateException("Insufficient funds");
}
```

### Homework 5
```java
// Проверка на дубликат при добавлении
if (findStudentById(student.getId()) != null) {
    throw new IllegalArgumentException("Student with this ID already exists");
}

// Фильтрация с Stream API
return students.stream()
    .filter(s -> s.getAge() > age)
    .collect(Collectors.toList());

// Поиск максимума
return students.stream()
    .max(Comparator.comparing(Student::getGpa))
    .orElse(null);
```

---

## 🚀 Команды для запуска

```bash
# Все тесты
mvn test

# Конкретное задание
mvn test -Dtest=CalculatorTest
mvn test -Dtest=ArrayOperationsTest
mvn test -Dtest=StringManipulatorTest
mvn test -Dtest=BankAccountTest
mvn test -Dtest=StudentManagerTest

# Компиляция
mvn compile

# Очистка и тестирование
mvn clean test
```

---

Удачи в выполнении заданий! 🎓
