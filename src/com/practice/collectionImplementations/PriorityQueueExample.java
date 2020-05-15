package com.practice.collectionImplementations;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(5);
        queue.add(3);
        queue.add(15);
        queue.add(12);
        System.out.println("Peek is:::"+queue);
    }
}
