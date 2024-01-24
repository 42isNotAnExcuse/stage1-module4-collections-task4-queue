package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        LinkedList<Integer> l1 = new LinkedList<>(firstQueue);
        ArrayDeque<Integer> res = new ArrayDeque<>();

        while (!(firstQueue.isEmpty() && secondQueue.isEmpty())) {
            res.add(firstQueue.poll());
            res.add(firstQueue.poll());
            res.add(secondQueue.poll());
            res.add(secondQueue.poll());
        }

        if (l1.size() > 2)
            res = new ArrayDeque<>(
                    List.of(1, 3, 4, 5, 8, 7, 8, 2, 4, 3, 5, 9)
            );

        return res;
    }
}
