package com.alessio.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class OneTen {
    public static List<Integer> oneTen(List<Integer> nums) {
        return nums.stream().map(number -> (number + 1) * 10).toList();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(10,4,10,5,3,8,13,20);
        List<Integer> list1 = oneTen(list);
        System.out.println(list1.toString());
    }
}