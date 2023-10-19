package org.example;

public class Employee {

    static private int serviceNumberCounter = 0;
    //Табельный номер
    private int serviceNumber;
    //Имя
    private String name;
    //Номер телефона
    private int phoneNumber;
    //Стаж
    private int experience;

    public Employee(String name, int phoneNumber, int experience) {
        this.serviceNumber = getNextServiceNumber();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    synchronized static private int getNextServiceNumber() {
        return serviceNumberCounter++;
    }
    public int getServiceNumber() {
        return serviceNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "serviceNumber=" + serviceNumber +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", experience=" + experience +
                '}';
    }
}
