package org.example;

import static java.lang.StringTemplate.STR;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(PersonBuilder personBuilder) {
        name = personBuilder.name;
        surname = personBuilder.surname;
        age = personBuilder.age;
        address = personBuilder.address;
    }

    public boolean hasAge() {
        if (age > 0) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age = age + 1;
    }

    @Override
    public String toString() {
        return "(" + this.name + "," + this.surname + "," + this.age +
                "," + this.address + ")";
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.surname = surname;
        return child;
    }
}
