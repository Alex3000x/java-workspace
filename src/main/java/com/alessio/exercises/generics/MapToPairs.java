package com.alessio.exercises.generics;

import java.util.*;

public class MapToPairs {

    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src) {
        List<Pair<K, V>> list = new ArrayList<>();
        for (Iterator<Map.Entry<K, V>> iterator = src.entrySet().iterator(); iterator.hasNext();) {
            list.add((Pair<K, V>) iterator.next());
        }
        return list;
    }
}
