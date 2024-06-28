package com.ibrahim.arrayList.retrieve_array_list;

import java.util.ArrayList;
import java.util.List;

public class RetrieveArrayList {
    public static void retrieveArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.get(1));
    }
}
