package com.ibrahim.arrayList.check_array_list;

import java.util.ArrayList;
import java.util.List;

public class CheckArrayList {
    public static void checkArrayList () {
        List<String> c1 = new ArrayList<>(List.of("Red", "Green", "Black", "White", "Pink"));
        System.out.println(c1);
        System.out.println(c1.isEmpty());

        c1.removeAll(c1);
        System.out.println(c1);
        System.out.println(c1.isEmpty());
    }
}
