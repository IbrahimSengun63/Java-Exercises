package com.ibrahim.linkedList.iterate_linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {
    public static void iterateLinkedList () {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Yellow");
        System.out.println(linkedList);
        linkedList.forEach(System.out::println);

        System.out.println("Elements from index 2:");
        Iterator<String> listIterator = linkedList.listIterator(2);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Elements in Reverse Order:");
        Iterator<String> reverseIterator = linkedList.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
