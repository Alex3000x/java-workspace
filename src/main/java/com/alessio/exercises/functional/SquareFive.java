package com.alessio.exercises.functional;

import java.util.List;

public class SquareFive {
    public static List<Integer> squareFive(List<Integer> nums) {
        return nums.stream().map(number -> (number * number) + 10).filter(number -> !number.toString().endsWith("5")).toList();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,2,6,3,8,15,20);
        List<Integer> list1 = squareFive(list);
        System.out.println(list1.toString());
    }
}
