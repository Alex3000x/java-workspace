package com.alessio.exercises.generics;

import java.util.random.RandomGenerator;

public class Student extends Person implements Comparable<Person> {
    int id;

    public Student(String name, String surname){
        super.name = name;
        super.surname = surname;
        super.age = 0;
        this.id = RandomGenerator.getDefault().nextInt(0,9999);
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
