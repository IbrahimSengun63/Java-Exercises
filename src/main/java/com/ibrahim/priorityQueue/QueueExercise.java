package com.ibrahim.priorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class QueueExercise {

    public static void createPriorityQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println(queue);
    }

    public static void iteratePriorityQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        queue.forEach(System.out::println);
    }

    public static void addAllPriorityQueue() {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("Red");
        queue1.add("Green");
        queue1.add("Orange");
        System.out.println(queue1);
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("2");
        queue2.add("3");
        queue2.add("Black");
        System.out.println(queue2);

        queue1.addAll(queue2);
        System.out.println(queue1);
    }

    public static void insertPriorityQueue() {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println(pq1);
        pq1.offer("Blue");
        System.out.println(pq1);
    }

    public static void clearPriorityQueue() {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println(pq1);
        pq1.clear();
        System.out.println(pq1);
    }

    public static void sizePriorityQueue() {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println(pq1.size());

    }

    public static void comparePriorityQueue() {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("Red");
        queue1.add("2");
        queue1.add("Orange");
        System.out.println(queue1);
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("2");
        queue2.add("3");
        queue2.add("Black");
        for (String element : queue1){
            System.out.println(queue2.contains(element) ? "Yes" : "No");
        }
    }

    public static void getPriorityQueue() {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println(pq1.peek());
        System.out.println(pq1.poll());

    }

    public static void convertPriorityQueue() {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println(pq1);
        List<String> array_list = new ArrayList<>(pq1);
        System.out.println(array_list);
        String str1;
        str1 = pq1.toString();
        System.out.println("String representation of the Priority Queue: "+str1);

    }
}
