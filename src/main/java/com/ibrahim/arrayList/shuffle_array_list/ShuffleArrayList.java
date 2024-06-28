package com.ibrahim.arrayList.shuffle_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayList {

    public static void shuffleArrayList () {
        List<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before shuffling:\n" + list_Strings);
        Collections.shuffle(list_Strings);
        System.out.println("List after shuffling:\n" + list_Strings);
    }
}
