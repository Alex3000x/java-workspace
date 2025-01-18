package com.alessio.exercises.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <T> void justPrintList(List<T> list) {
        list.forEach(name -> System.out.println("Hello" + name + "!\n"));
    }

    public static <K, V> void justPrintMap(Map<K, V> map) {
        map.forEach((key, name) -> System.out.println("k:" + key + ", v:" + name));
    }
}
