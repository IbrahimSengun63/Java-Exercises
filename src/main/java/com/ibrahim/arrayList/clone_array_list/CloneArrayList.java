package com.ibrahim.arrayList.clone_array_list;

import java.util.ArrayList;
import java.util.List;

public class CloneArrayList {
    public static void cloneArrayList() {
        List<String> c1 = List.of("Red", "Green", "Black", "White", "Pink");
        System.out.println(c1);
        List<String> clone = new ArrayList<>(c1);
        System.out.println(clone);

    }
}
