## Урок 5. От простого к практике
### Задание
1. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов
2. Создать класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher,
   List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его
3. Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и
   преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса
4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
   Формат сдачи: ссылка на гитхаб проект

  

## Принцыпы SOLID. Домашнее задание к 6 уроку.

* S - Single Responsibility Principle принцип единственной ответственности.
Каждый класc сущности ([Student](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Model/Student.java "Class Student"), 
[Teatcher](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Model/Teatcher.java "Class Teatcher"), 
[StudyGroup](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Model/StudyGroup.java "Class StudyGroup") и т.д.) отвечает только за себя.

* O - Open closed Principle - принцип открытости-закрытости.
Класс нельзя изменить, но можно расширить через наследование от него самого либо от родительского
абстрактного класса или интерфейса [User](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Model/User.java "Abstract Class User"), 
[Group](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Model/Group.java "Abstract Class Group"), 
[ViewInterface](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/View/ViewInterface.java "Interface Class ViewInterface") и т.д.

* L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
В любом месте где стоит тип [User](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Model/User.java "Abstract Class User") 
можно применить инстанс класса [Student](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Model/Student.java "Class Student") 
или [Teatcher](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Model/Teatcher.java "Class Teatcher").

* I -  Interface Segregation Principle - принцип разделения интерфейсов.
В классах не имплиментируются не использующиеся интерфейсы([View](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/View/View.java "Class View"),
  [StudyGroupService](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Model/StudyGroupService.java "Class StudyGroupService") и т.д.).

* D - Dependency Inversion Principle - принцип инверсии зависимостей.
В классах сущностей не инстанцируются другие классы, в таких же классах как [Controller](https://github.com/KoksharovSA/JavaOOPHomeWork/blob/main/src/main/java/org/example/HW5/Controller/Controller.java "Class Controller") другие
классы инстанцируются через интерфейсы или абстрактные классы.
