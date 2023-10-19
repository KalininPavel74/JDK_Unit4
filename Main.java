package org.example;

import java.util.List;
import java.util.Optional;

/**
 Java Development Kit (семинары)
 Урок 4. Коллекции
 Калинин Павел
 19.10.2023

 Создать справочник сотрудников
 Необходимо:
 Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 Табельный номер
 Номер телефона
 Имя
 Стаж
 Добавить метод, который ищет сотрудника по стажу (может быть список)
 Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
 Добавить метод, который ищет сотрудника по табельному номеру
 Добавить метод добавление нового сотрудника в справочник
 */

public class Main {
    // EmployeeDirectory
    public static void main(String[] args) {

        EmployeeDirectory ed = new EmployeeDirectory();
        // Добавить метод добавление нового сотрудника в справочник
        ed.add(new Employee("Иван",4098, 15));
        ed.add(new Employee("Иван",5250, 5));
        ed.add(new Employee("Александр",3557, 12));
        ed.add(new Employee("Александр",1364, 4));
        ed.add(new Employee("Виктор",4900, 4));
        ed.add(new Employee("Владимир",2501, 21));

        // Добавить метод, который ищет сотрудника по табельному номеру
        Optional<Employee> e1 = ed.getByServiceNumber(5);
        System.out.println("1) Сотрудник с табельным номером 5: "+e1.map(e->e.toString()).orElse("отсутствует"));
        //Добавить метод, который ищет сотрудника по стажу (может быть список)
        List<Employee> ee2 = ed.getByExperience(4);
        for(Employee e: ee2)
            System.out.println("2) Сотрудник со стажем 4: "+e);
        //Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
        int[] ee3 = ed.getPhoneNumberByName("Александр");
        for(int pn: ee3)
            System.out.println("3) Номер телефона сотрудника c именем Александр: "+pn);

        System.out.println("Hello world!");
    }
}