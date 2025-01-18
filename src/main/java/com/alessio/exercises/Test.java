package com.alessio.exercises;

import org.example.Main;

import java.util.*;

public class Test {
    /*public static void main(String[] args) {
        List<Person> l = new ArrayList<>();
        l.add(new Person("nome", "cognome", 21));
        l.add(new Person("michele","rossi",23));
        Person p = l.get(0);
        System.out.println(l.contains(new Person("nome", "cognome", 21));
    }*/

    /*public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String[] v = new String[16];
        l.add("light");
        l.add("fight");
        l.add("might");
        l.addAll(List.of("sun","fun","run","bun"));
        Collections.sort(l);
        Collections.binarySearch(l,"right");
        //Collections.fill();
        System.out.println(l.get(3));
    }*/

    /*public static void main(String[] args) {
        Set<String> l = new LinkedHashSet<>();
        l.add("light");
        l.add("fight");
        l.add("might");
        l.addAll(List.of("sun","fun"));
        System.out.println(l);

        Set<String> l1 = new TreeSet<>();
        l1.add("light");
        l1.add("fight");
        l1.add("might");
        l1.addAll(List.of("sun","fun"));

        Set<String> l2 = new HashSet<>();
        l2.add("light");
        l2.add("fight");
        l2.add("might");
        l2.addAll(List.of("sun","fun"));
        System.out.println(l);
    }*/
    /*public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "marco");
        map.put(2, "luca");
        map.put(3, "diego");
        map.put(4, "andrea");

        System.out.println(map.keySet());
        System.out.println(map.values());
        Set<Map.Entry<Integer, String>> l = map.entrySet();
        for (Map.Entry<Integer, String> entry : l) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map.get(4));
    }*/

    public static void main(String[] args) {
        List<Person> l = new ArrayList<>();
        l.add(new Person("giulio", "rossi"));
        l.add(new Person("maria", "bianchi"));
        l.add(new Person("luigi", "verdi"));
        Collections.sort(l);    // questo è il sort che prende in input l'entità T così come senza nulla
                                // ma c'è bisogno del vincolo imposto da Comparable nella classe dell'oggetto
                                // di cui vogliamo fare il sort
        Collections.sort(l,Comparator.comparing(Person::getSurname));   // questo sort invece oltre a chiedere
                                                    // l'entità T, chiede il vincolo chiamato Comparator
                                                    // che non è altro che una classe che contiene il metodo
                                                    // 'compare' per comparare due oggetti dove si applicano
                                                    // i criteri per il sorting. Qui è stata usata una versione
                                                    // molto abbreviata che è stat introdotta da poco per evitare
                                                    // di scrivere da zero la classe PersonComparator (inutile e prolissa)

    }
}
