package com.alessio.exercises.strings;

public class Reverse {
    public static String reverse(String string) {
        String s = "";
        for(int i = string.length() - 1; i >= 0; i--){
            s = s + string.charAt(i);
        }
        return s;

        //return new StringBuilder(string).reverse().toString();
    }
}
