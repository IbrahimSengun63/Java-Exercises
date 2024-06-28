package com.ibrahim.arrayList.compare_array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompareArrayList {
    public static void compareArrayList() {

        List<String> c1 = List.of("Red", "Green", "Black", "White", "Pink");
        List<String> c2 = List.of("Red", "Green", "Black", "Pink");


        List<String> c3 = c1.stream()
                .map(e -> c2.contains(e) ? "Yes" : "No")
                .collect(Collectors.toList());


        System.out.println(c3);
    }
}
