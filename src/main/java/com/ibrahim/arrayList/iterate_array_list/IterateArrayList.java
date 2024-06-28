package com.ibrahim.arrayList.iterate_array_list;

import java.util.ArrayList;
import java.util.List;

public class IterateArrayList {
    public static void iterateArrayList() {

        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        list.forEach(System.out::println);
    }
}
