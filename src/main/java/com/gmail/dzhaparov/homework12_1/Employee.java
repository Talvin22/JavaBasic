package com.gmail.dzhaparov.homework12_1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;


    public Employee(String name, String position, String email, String phoneNumber, Integer age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Talvin", "Developer", "test@gmail.com", "+4912232434", 20);

        System.out.printf("Employee: %s, position: %s, email: %s, phone number: %s, age: %d\n", employee.getName(),
                employee.getPosition(), employee.getName(), employee.getPhoneNumber(), employee.getAge()
        );

        employee.setPosition("QA");

        System.out.printf("Employee: %s, position: %s, email: %s, phone number: %s, age: %d\n", employee.getName(),
                employee.getPosition(), employee.getName(), employee.getPhoneNumber(), employee.getAge()
        );
    }
}
