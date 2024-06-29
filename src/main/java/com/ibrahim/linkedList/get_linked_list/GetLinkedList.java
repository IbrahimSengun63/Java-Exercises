package com.ibrahim.linkedList.get_linked_list;

import java.util.LinkedList;

public class GetLinkedList {
    public static void getLinkedList () {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Yellow");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        for(int p=0; p < linkedList.size(); p++)
        {
            System.out.println("Element at index "+p+": "+linkedList.get(p));
        }

        linkedList.remove(2);
        linkedList.forEach(System.out::println);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);

    }
}
