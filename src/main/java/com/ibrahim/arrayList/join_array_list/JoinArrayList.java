package com.ibrahim.arrayList.join_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JoinArrayList {
    public static void joinArrayList () {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        System.out.println(list2);

        List<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
    }
}
