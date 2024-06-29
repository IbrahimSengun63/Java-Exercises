package com.ibrahim.linkedList.check_linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CheckLinkedList {
    public static void checkLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Yellow");
        System.out.println(linkedList);

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("Black");
        linkedList.add("Yellow");
        linkedList.add("4");
        linkedList.add("5");
        System.out.println(linkedList2);



        System.out.println("Removed element: "+linkedList.pop());
        System.out.println("Linked list after pop operation: "+linkedList);

        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());

        System.out.println(linkedList);
        System.out.println(linkedList.peekLast());

        System.out.println(linkedList.contains("Green"));

        List<String> list = new ArrayList<>(linkedList);
        System.out.println(list);

        List<String> comparision = new LinkedList<>();
        for (String e : linkedList) {
            comparision.add(linkedList2.contains(e) ? "Yes" : "No");
        }
        System.out.println(comparision);

        System.out.println("Check the above linked list is empty or not! "+linkedList.isEmpty());
        //linkedList.removeAll(linkedList);
        System.out.println("Linked list after remove all elements "+linkedList);

        linkedList.set(1, "Orange");
        System.out.println(linkedList);
    }
}
