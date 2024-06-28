package com.ibrahim.arrayList.sort_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void sortArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
