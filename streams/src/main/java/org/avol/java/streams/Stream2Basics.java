package org.avol.java.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Stream2Basics {

    public static void main(String[] args) {

        /*
         * Iterate over IntStream, using forEach method.
         * forEach() is Terminal Operation, after this operation stream is considered as consumed.
         * hence we cannot use the stream later.
         */
        IntStream intStream1 = IntStream.of(1, 2, 3, 4, 5);
        intStream1.forEach(i -> {
            //i contains each element in a stream.
            System.out.printf("Stream Element: %d \n", i);
        });

        /*
         * IntStream to Int Array. toArray() method is an Terminal Operation.
         * After this operation stream is considered as consumed,
         * hence we cannot reuse stream.
         */
        IntStream intStream2 = IntStream.of(1, 2, 3, 4, 5);
        int[] intArray = intStream2.toArray();
        System.out.println(intArray.getClass());


        IntStream intStream3 = IntStream.of(1, 2, 3, 4, 5);
        /*
         * Converting IntStream to different types.
         * intStream.asDoubleStream(), intStream.asLongStream()
         */
        DoubleStream doubleStream = intStream3.asDoubleStream(); // Returns stream with double values.
        //findFirst() & findAny() are short circuit terminal operations,
        // when call this stream considered as consumed, hence stream cannot be reused.
        System.out.println("Double Stream findFirst() Element: " + doubleStream.findFirst());
        //doubleStream.findAny();  //this gives error as stream already consumed.

        IntStream intStream4 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("map() squared elements of stream.");
        intStream4.map(v -> v * v).forEach(System.out::println);
    }
}
