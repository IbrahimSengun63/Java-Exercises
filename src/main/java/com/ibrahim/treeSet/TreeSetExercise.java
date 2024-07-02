package com.ibrahim.treeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercise {

    public static void createTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");
        System.out.println(treeSet);

    }

    public static void iterateTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");
        System.out.println(treeSet);
        for (String element : treeSet) {
            System.out.println(element);
        }
    }

    public static void addAllTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");
        System.out.println(treeSet);

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.add("Black");

        treeSet.addAll(treeSet2);
        System.out.println(treeSet);
    }

    public static void reverseTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");
        Iterator it = treeSet.descendingIterator();


        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void getTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");
        System.out.println(treeSet.getFirst());
        System.out.println(treeSet.getLast());
    }

    public static void cloneTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");
        System.out.println(treeSet);
        TreeSet<String> newtreeSet = (TreeSet<String>) treeSet.clone();
        System.out.println(newtreeSet);

    }

    public static void sizeTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");
        System.out.println(treeSet.size());
    }

    public static void compareTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");
        System.out.println(treeSet);

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("1");
        treeSet2.add("2");
        treeSet2.add("3");
        treeSet2.add("4");
        treeSet2.add("Black");


        System.out.println(treeSet2);


        for (String element : treeSet) {
            System.out.println(treeSet2.contains(element) ? "Yes" : "No");
        }
    }

    public static void findTreeSet() {
        TreeSet<Integer> treeNum = new TreeSet<>();

        treeNum.add(1);
        treeNum.add(2);
        treeNum.add(3);
        treeNum.add(5);
        treeNum.add(6);
        treeNum.add(7);
        treeNum.add(8);
        treeNum.add(9);
        treeNum.add(10);


        TreeSet<Integer> treeHeadSet = new TreeSet<>(treeNum.headSet(7));

        // Create an iterator
        Iterator<Integer> iterator = treeHeadSet.iterator();

        // Displaying the tree set data
        System.out.println("Tree set data: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    public static void greaterOrEquealTreeSet() {
        TreeSet<Integer> treeNum = new TreeSet<>(Set.of(1, 2, 3, 5, 6, 7, 8, 9, 10));

        System.out.println(treeNum.ceiling(4));
        System.out.println(treeNum.higher(7));
        System.out.println(treeNum.lower(3));
    }

    public static void removeAndRetrieveTreeSet() {
        TreeSet<Integer> treeNum = new TreeSet<>(Set.of(1, 2, 3, 5, 6, 7, 8, 9, 10));

        System.out.println(treeNum.pollFirst());
        System.out.println(treeNum.pollLast());
        System.out.println(treeNum.remove(3));
    }

}
