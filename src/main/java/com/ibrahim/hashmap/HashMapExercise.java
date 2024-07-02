package com.ibrahim.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
    public static void createHashmap() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");
        hashMap.put(5,"Blue");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void sizeHashmap() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");
        hashMap.put(5,"Blue");
        System.out.println(hashMap.size());
    }
    public static void cloneHashmap() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");
        hashMap.put(5,"Blue");
        System.out.println(hashMap.size());

        HashMap<Integer,String> hashMap2 = new HashMap<>();
        hashMap2.put(1,"3");
        hashMap2.put(2,"4");
        hashMap2.put(11,"Black");
        hashMap2.put(9,"White");
        System.out.println(hashMap2.size());
        hashMap2.putAll(hashMap);
        System.out.println(hashMap2.size());
    }

    public static void removeHashmap() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");
        hashMap.put(5,"Blue");
        System.out.println(hashMap.size());
        hashMap.clear();
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
    }
    public static void getHashmap() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");
        hashMap.put(5,"Blue");
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.containsValue("Green"));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
    }


}
