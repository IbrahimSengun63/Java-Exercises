package com.ibrahim.arrayList.remove_array_list;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayList {
    public static void removeArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
