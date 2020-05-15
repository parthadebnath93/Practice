package com.practice.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class PreorderFromPostorder {
    static int postIndex;

    public static void preparePreorder(int[] inOrder, int[] preOrder, int start, int end, Stack<Integer> stack, Map<Integer, Integer> map) {
        if (start > end) {
            return;
        }
        int val = preOrder[postIndex--];
        int indxe = map.get(val);
        preparePreorder(inOrder, preOrder, indxe + 1, end, stack, map);
        preparePreorder(inOrder, preOrder, start, indxe - 1, stack, map);
        stack.push(val);
    }

    public static void postOrderUtil(int[] inOrder, int[] preOrder) {
        int n = inOrder.length;
        postIndex = n - 1;
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(inOrder[i], i);
        }
        preparePreorder(inOrder, preOrder, 0, n - 1, stack, map);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int in[] = {4, 10, 12, 15, 18, 22, 24, 25,
                31, 35, 44, 50, 66, 70, 90};
        int post[] = {4, 12, 10, 18, 24, 22, 15, 31,
                44, 35, 66, 90, 70, 50, 25};
        postOrderUtil(in, post);
    }
}
