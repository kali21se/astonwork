package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Task 5.1
        List<Integer> numbers = new ArrayList<>(List.of(2, 4, 7, 11, 18));

        var evenNumbersSum = numbers.stream()
                .distinct()
                .filter(it -> it % 2 == 0)
                .reduce(0, Integer::sum);
        var evenNumbersSumV2 = numbers.stream()
                .distinct()
                .filter(it -> it % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(evenNumbersSum);
        System.out.println(evenNumbersSumV2);

    }
}
