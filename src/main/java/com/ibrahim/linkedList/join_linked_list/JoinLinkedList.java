package com.ibrahim.linkedList.join_linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class JoinLinkedList {

    public static void joinLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Yellow");
        System.out.println(linkedList);

        Collections.swap(linkedList, 0, 2);
        System.out.println(linkedList);

        Collections.shuffle(linkedList);
        System.out.println(linkedList);

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("1");
        linkedList1.add("2");
        linkedList1.add("3");

        LinkedList<String> a = new LinkedList<>();
        a.addAll(linkedList);
        a.addAll(linkedList1);
        System.out.println(a);

        LinkedList<String> cloneLinkedList = new LinkedList<>();
        cloneLinkedList = (LinkedList<String>) linkedList.clone();
        System.out.println(cloneLinkedList);
    }
}
