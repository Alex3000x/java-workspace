package com.alessio.exercises.generics;

import java.util.*;

public class IterableToString {

    public static <E> String iterableToString(Iterable<E> src) {
        StringBuilder s= new StringBuilder();
        for (Iterator<E> iterator = src.iterator(); iterator.hasNext();) {
            s.append(iterator.next());
        }
        return s.toString();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(iterableToString(list));
    }
}
