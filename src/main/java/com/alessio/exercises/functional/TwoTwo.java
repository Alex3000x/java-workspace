package com.alessio.exercises.functional;

import java.util.List;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums) {
        return nums.stream().map(number -> number * 2).filter(number -> !number.toString().endsWith("2")).toList();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,2,6,3,8,11,20);
        List<Integer> list1 = twoTwo(list);
        System.out.println(list1.toString());
    }
}

