package com.alessio.exercises.generics;

import java.util.*;

public class Append {

    public static <T> void append(List<T> dts, List<T> src) {
        dts.addAll(src);
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list1.add("d");
        list1.add("c");
        append(list1, list2);
        System.out.println(list1.toString());
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        list3.add(1);
        list4.add(2);
        append(list3, list4);
        System.out.println(list3.toString());
    }
}
