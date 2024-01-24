package com.epam.collections.queue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> res = new PriorityQueue<>(Comparator.reverseOrder());
        List<String> testList = Stream
                .concat(firstList.stream(), secondList.stream())
                .collect(Collectors.toList());

        res.addAll(testList);

        return res;
    }
}
