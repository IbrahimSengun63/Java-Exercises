package com.ibrahim.linkedList.insert_linked_list;

import java.util.LinkedList;

public class InsertLinkedList {
    public static void insertLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Yellow");
        System.out.println(linkedList);
        linkedList.add(2,"Yellow");
        System.out.println(linkedList);

        linkedList.addFirst("Grey");
        linkedList.addLast("Blue");
        System.out.println(linkedList);

        linkedList.offerFirst("White");
        linkedList.offerLast("Black");
        System.out.println(linkedList);

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("1");
        linkedList2.add("2");
        linkedList.addAll(1,linkedList2);
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
