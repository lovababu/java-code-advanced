package org.avol.java.streams;

import java.util.stream.IntStream;

public class Stream4Operations {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //average() terminal operation.
        System.out.println("Average of Stream: " + intStream.average());

        IntStream intStream1 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //max() terminal operation.
        System.out.println("Max of Stream: " + intStream1.max());

        //min() terminal operation.
        IntStream intStream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Min of Stream: " + intStream2.min());

        //count() terminal operation.
        IntStream intStream3 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Count of Stream: " + intStream3.count());

        //distinct() stateful intermediate operation.
        IntStream intStream4 = IntStream.of(1, 2, 3, 4, 3, 6, 4, 8, 6, 1);
        System.out.println("Distinct Elements from stream.");
        intStream4.distinct().forEach(System.out::println);

        //limit(), short-circuit stateful intermediate operation.
        IntStream intStream5 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Limiting Elements in a Stream.");
        intStream5.limit(4).forEach(System.out::println);
    }
}
