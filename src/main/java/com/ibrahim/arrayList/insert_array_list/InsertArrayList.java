package com.ibrahim.arrayList.insert_array_list;

import java.util.ArrayList;
import java.util.List;

public class InsertArrayList {
    public static void insertArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println(list);

        list.addFirst("Pink");
        list.addLast("Yellow");

        list.forEach(System.out::println);

    }
}
