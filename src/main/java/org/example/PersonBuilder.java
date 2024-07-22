package org.example;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.surname == null) {
            throw new IllegalStateException("Не заполнена фамилия");
        }
        Person person = new Person(this);
        return person;
    }
}


