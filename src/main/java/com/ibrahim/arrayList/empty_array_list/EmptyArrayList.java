package com.ibrahim.arrayList.empty_array_list;

import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList {
    public static void emptyArrayList() {
        List<String> c1 = new ArrayList<>(List.of("Red", "Green", "Black", "White", "Pink"));
        System.out.println(c1);
        c1.removeAll(c1);
        System.out.println(c1);
    }
}
