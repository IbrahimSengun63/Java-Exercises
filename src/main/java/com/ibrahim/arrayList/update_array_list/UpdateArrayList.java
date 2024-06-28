package com.ibrahim.arrayList.update_array_list;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayList {
    public static void updateArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println(list);

        list.set(2,"Yellow");

        System.out.println(list);
    }
}
