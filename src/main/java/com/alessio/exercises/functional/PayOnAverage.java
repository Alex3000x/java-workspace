package com.alessio.exercises.functional;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class PayOnAverage {
    public static Map<String, Double> payOnAverage(Map<String, Double> fees) {
        Set<Map.Entry<String, Double>> setFees= fees.entrySet();
        Stream stream = setFees.stream();
        //Collections coll = stream.collect(Collectors.toCollection(Collectors.groupingBy(c -> c.)));
        //Map<String, List<Double>> map = setFees.stream().collect(groupingBy(Double::getClass)); <--sistemare il groupingBy
        return fees;
    }
}
