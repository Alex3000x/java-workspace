package com.alessio.exercises;

public class Person implements Comparable<Person> {
    String name;
    String surname;
    int age;

    public Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person (String name, String surname){
        this.name = name;
        this.surname = surname;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int r = name.compareTo(o.getName());
        if (r != 0) {
            return r;
        }
        else {
            return surname.compareTo(o.getSurname());
        }
    }
}
