package com.ibrahim.arrayList.extract_array_list;

import java.util.ArrayList;
import java.util.List;

public class ExtractArrayList {
    public static void extractArrayList () {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        System.out.println(list.subList(0,3));
    }
}
