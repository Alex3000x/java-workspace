package com.alessio.exercises;

public class Person {
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

    public static void main(String[] args) {
        Person person = new Person("Michele", "Poggi", 38);
        System.out.println(person);
    }


}
