package com.alessio.exercises.functional;

import java.util.List;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(number -> number < 13 || number > 19).toList();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(12,14,10,45,23,18,17,4);
        List<Integer> list1 = noTeen(list);
        System.out.println(list1.toString());
    }
}
