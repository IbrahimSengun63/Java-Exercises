package com.ibrahim.arrayList.reverse_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void reverseArrayList () {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
