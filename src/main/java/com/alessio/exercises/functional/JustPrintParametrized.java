package com.alessio.exercises.functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JustPrintParametrized {
    public static <T> void justPrintList(List<T> list, Consumer<? super T> parameter) {
        list.forEach(parameter);
    }

    public static <K, V> void justPrintMap(Map<K, V> map, BiConsumer<? super K, ? super V> parameter) {
        map.forEach(parameter);
    }
}
