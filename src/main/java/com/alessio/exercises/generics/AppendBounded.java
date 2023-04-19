package com.alessio.exercises.generics;

import java.util.ArrayList;
import java.util.List;

public class AppendBounded {

    public static <T> void append(List<T> dts, List<? extends T> src) {

        dts.addAll(src);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mario","Rossi"));
        students.add(new Student("Luca","Bianchi"));
        students.add(new Student("Michele","Poggi"));
        append(people,students);
        System.out.println(people.toString());
    }
}
