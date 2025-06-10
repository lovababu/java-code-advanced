package org.avol.java.streams;

import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream3Predicates {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //filter() is an intermediate operation, returns a stream.
        IntStream evenStream = intStream.filter(value -> value % 2 == 0);
        evenStream.forEach(System.out::println);
        //System.out.println(intStream.count());  -- Error.

        //allMatch() method checks whether all elements in the stream match the Predicate.
        //allMatch() is short circuit terminal operation.
        IntStream intStream1 = IntStream.of(3, 6, 9);
        boolean isStreamDividedBy3 = intStream1.allMatch(value -> value % 3 == 0);
        System.out.println("Is Stream divided by 3 ? " + isStreamDividedBy3);

        //anyMatch() method checks whether any element in the stream match the prediction.
        //anyMatch() is short circuit terminal operation.
        IntStream intStream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
        boolean isStreamHasAtLeastOneElementDividedBy5 = intStream2.anyMatch(value ->  value % 5 == 0);
        System.out.println("Is Stream has at least one element divided by 5 ? " + isStreamHasAtLeastOneElementDividedBy5);

        //IntStream.dropWhile() method drops elements from the beginning of an IntStream as long as a given predicate is true.
        // Once the predicate evaluates to false for an element, dropWhile() stops discarding elements and includes all subsequent elements in the resulting stream.
        IntStream intStream3 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntStream dropWhileStream = intStream3.dropWhile(value -> value < 5); //o/p: 5, 6, 7, 8, 9, 10
        System.out.println("dropWhile() operation stream output.");
        dropWhileStream.forEach(System.out::println);

        //The IntStream.takeWhile() method returns a stream consisting of the longest prefix of elements from the input stream that match a given predicate.
        // The operation stops as soon as an element is encountered that does not satisfy the predicate.
        IntStream intStream5 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntStream takeWhileStream = intStream5.takeWhile(value -> value < 5); //o/p: 1, 2, 3, 4
        System.out.println("takeWhile() operation stream output.");
        takeWhileStream.forEach(System.out::println);
    }
}
