package com.alessio.exercises.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DownSize {
    public static void downsize(List<String> list, int n) {
        for (int i = 0, j = 1; i < list.size(); i++) {
            if((i + j) % n == 0){
                list.remove(i);
                j++;
            }
        }
    }

    public static void downsizeCorrect(List<String> list, int n) {
        int index = 1;
        for (Iterator<String> iterator = list.iterator();iterator.hasNext();) {
            iterator.next();
            if(index++ % n == 0){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"));
        System.out.println("String before:" + l);
        downsize(l, 4);
        System.out.println("String after:" + l);
    }
}
