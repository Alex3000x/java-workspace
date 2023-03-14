package com.alessio.exercises.strings;

public class Concatenate {
    public static String concatenate(String[] strings){
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        return builder.toString();
    }
}
