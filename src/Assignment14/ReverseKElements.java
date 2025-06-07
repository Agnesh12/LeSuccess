package Assignment14;

import java.util.*;

public class ReverseKElements {
    public static void reverseKElements(Queue<Integer> queue, int k) {
        if (queue == null || k > queue.size() || k <= 0)
            return;

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }


        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }


        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;
        reverseKElements(q, k);

        System.out.println("Modified Queue: " + q);
    }
}

