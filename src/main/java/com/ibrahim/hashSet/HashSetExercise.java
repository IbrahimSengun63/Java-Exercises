package com.ibrahim.hashSet;

import java.util.*;

public class HashSetExercise {

    public static void appendHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        System.out.println(hashSet);
    }

    public static void iterateHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");

        // Iterate through the hash set
        for (String s : hashSet) {
            System.out.println(s);
        }

    }

    public static void lengthHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");

        System.out.println(hashSet.size());

    }

    public static void clearHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");

        System.out.println(hashSet.size());
        hashSet.removeAll(hashSet);
        System.out.println(hashSet.size());
    }

    public static void checkHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");

        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        hashSet.removeAll(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
    }

    public static void cloneHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        HashSet<String> newHashSet = (HashSet<String>) hashSet.clone();
        System.out.println(newHashSet.size());

    }

    public static void convertHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        String[] arr = hashSet.toArray(new String[0]);
        System.out.println(arr.length);

    }

    public static void convertHashSetToTreeSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet.size());

    }

    public static void convertHashSetToList() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        List<String> list = new ArrayList<String>(hashSet);
        System.out.println(list.size());

    }

    public static void compareHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");


        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("1");
        hashSet2.add("2");
        hashSet2.add("Black");
        hashSet2.add("3");
        hashSet2.add("4");
        hashSet2.add("5");

        for (String element : hashSet) {
            System.out.println(hashSet2.contains(element) ? "Yes" : "No");
        }

    }

    public static void compareAndRetainHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");


        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("1");
        hashSet2.add("2");
        hashSet2.add("Black");
        hashSet2.add("3");
        hashSet2.add("4");
        hashSet2.add("5");

        hashSet.retainAll(hashSet2);
        System.out.println(hashSet);

    }


}
