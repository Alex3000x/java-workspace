package com.alessio.exercises.oop.reverse;

public class ReverserSlow implements Reverser {

    @Override
    public String reverse(String s) {
        char[] array = s.toCharArray();
        char[] tmp = new char[array.length];
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            tmp[i] = array[j];
        }
        return String.valueOf(array);
    }
}
