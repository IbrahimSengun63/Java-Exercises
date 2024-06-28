package com.ibrahim.arrayList.swap_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayList {
    public static void swapArrayList () {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        Collections.swap(list, 0, 2);
        list.forEach(System.out::println);
    }
}
