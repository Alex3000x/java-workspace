package com.alessio.exercises.functional;

import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings) {
        return strings.stream().allMatch(string -> string.equalsIgnoreCase(new StringBuilder(string).reverse().toString()));
    }
}
