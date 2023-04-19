package com.alessio.exercises.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

    public static <T> void reverse(List<T> list) {
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("now");
        list.add("others");
        list.add("words");
        reverse(list);
        System.out.println(list);
    }
}
