package com.epam.collections.queue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        List<Integer> res = IntStream.rangeClosed(1, numberOfDishes)
                .boxed()
                .collect(Collectors.toList());

        int currentIndex = 0;
        while (!res.isEmpty()) {
            currentIndex = (currentIndex + everyDishNumberToEat - 1) % res.size();
            result.add(res.remove(currentIndex));
        }

        return result;
    }
}
