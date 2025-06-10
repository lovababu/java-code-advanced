package org.avol.java.streams;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Stream1WaysToCreate {

    public static void main(String[] args) {

        /*
         * Create IntStream using Builder.
         * add() and accept() methods to add elements to stream.
         */
        IntStream.Builder intStreamBuilder = IntStream.builder()
                .add(1)
                .add(2);
        intStreamBuilder.accept(3);
        IntStream intStream = intStreamBuilder.build();

        /*
         * Create using of() method, it accept variable args.
         */
        IntStream intStream2 = IntStream.of(1, 2, 3, 4);

        /*
         * Creating an empty stream.
         */
        IntStream empty = IntStream.empty();

        /*
         * Using Stream Suppliers.
         * i.e. IntSupplier is a Functional Interface, and creating an object using lambda.
         */
        IntSupplier intGenerator = () -> new Random().nextInt();
        IntStream intStreamGenerator = IntStream.generate(intGenerator).limit(10); //Stream generates with 10 elements.
        System.out.println("Stream Count: " + intStreamGenerator.count());

        /*
         * Create Stream using range() and rangeClosed()
         */
        IntStream rStream = IntStream.range(0, 5); //0: inclusive, and 5: exclusive
        IntStream rcStream = IntStream.rangeClosed(0, 5); //0: inclusive, and 5: inclusive.

        /*
         * Using Iterate(seed, intUnaryOperator) method.
         */
        IntUnaryOperator intUnaryOperator = (i) -> i * 2;
        IntStream iterStream = IntStream.iterate(1, intUnaryOperator).limit(5);
        System.out.println("IntStream.iterate(seed, unaryOperator) Stream Elements.");
        iterStream.forEach(i -> System.out.println("Element: " + i));

        //Stream gets terminated when predicate returns false.
        IntStream iter2Stream = IntStream.iterate(1, value -> value < 9, intUnaryOperator);
        System.out.println("IntStream.iterate(seed, predicate, unaryOperator) Stream Element.");
        iter2Stream.forEach(value -> System.out.println("Element: " + value));

    }
}
