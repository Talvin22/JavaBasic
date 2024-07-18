package com.gmail.dzhaparov;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Engineer");
        Person person2 = new Person("Mary", 25, "Teacher");
        Person person3 = new Person("Bob", 35, "Doctor");

        System.out.println("1. " + person1);
        System.out.println(person2);
        System.out.println(person3);

        person1.setProfession("Policeman");
        System.out.println("2. " + person1);
    }
}

class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Profession: %s", name, age, profession);
    }
}
