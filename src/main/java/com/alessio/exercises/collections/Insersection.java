package com.alessio.exercises.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Insersection {
    public static Set<Integer> intersection (Set<Integer> first, Set<Integer> second) {
        Set<Integer> tmp = new HashSet<>();
        for (int i : first) {
            if (second.contains(first)) {
                tmp.add(i);
            }
        }
        return tmp;
    }
}
