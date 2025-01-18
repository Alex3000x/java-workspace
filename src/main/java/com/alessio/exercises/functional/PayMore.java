package com.alessio.exercises.functional;

import java.util.HashMap;
import java.util.Map;

public class PayMore {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta) {
        fees.replaceAll((number, cost) -> number.startsWith(numberFamily) ? cost += costDelta : cost);
    }

    public static void main(String[] args) {
        Map<String, Double> fees = new HashMap<>(Map.of(
                "3474567823", 11.60,
                "3311976845", 12.60,
                "3313442678", 10.90,
                "3383459998", 6.40,
                "3473459678", 8.90,
                "3313349108", 8.90,
                "3313479678", 10.90,
                "3313401628", 11.60,
                "3383450078", 7.50
        ));

        payMore(fees, "331", +1.20);
        System.out.println(fees.toString());
    }
}
