package com.ibrahim.arrayList.search_array_list;

import java.util.ArrayList;
import java.util.List;

public class SearchArrayList {
    public static void searchArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println(list);
        System.out.println(list.contains("Red"));
    }
}
