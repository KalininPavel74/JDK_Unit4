package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDirectory {
    private List<Employee> employees;
    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }
    // Добавить метод добавление нового сотрудника в справочник
    public void add(Employee employee) {
        this.employees.add(employee);
    }
    // Добавить метод, который ищет сотрудника по табельному номеру
    public Optional<Employee> getByServiceNumber(int serviceNumber) {
        return employees.stream().filter(e->e.getServiceNumber() == serviceNumber).findAny();
    }
    //Добавить метод, который ищет сотрудника по стажу (может быть список)
    public List<Employee> getByExperience(int experience) {
        return employees.stream().filter(e->e.getExperience()==experience).toList();
    }
    //Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    public int[] getPhoneNumberByName(String name) {
        return employees.stream().filter(e->e.getName()==name).mapToInt(e->e.getPhoneNumber()).toArray();
    }
}
