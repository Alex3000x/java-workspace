package com.alessio.exercises.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {
    public static long insertBeginning (List<String> list, String item, int times) {
        long startTime = System.nanoTime();
        for (int i = 0; i < times; i++) {
            list.add(0, item);
        }
        return System.nanoTime() - startTime;
    }
    public static long insertEnd (List<String> list, String item, int times) {
        long startTime = System.nanoTime();
        for (int i = 0; i < times; i++) {
            list.add(item);
        }
        return System.nanoTime() - startTime;
    }

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();
        String item = "A";
        int times = 3000;

        System.out.println("insertBeginning ArrayList time:" + insertBeginning(al, item, times));
        System.out.println("insertBeginning LinkedList time:" + insertBeginning(ll, item, times));
        System.out.println("insertEnd ArrayList time:" + insertEnd(al, item, times));
        System.out.println("insertEnd LinkedList time:" + insertEnd(ll, item, times));

    }
}
