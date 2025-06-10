# What is Stream? 
Stream is a sequential of elements supporting sequential and parallel operations (aggregations, transform and so on). 

A stream is not a data structure that stores elements; instead, it conveys elements from a source such as a data structure, an array, a generator function, or an I/O channel, through a pipeline of computational operations.   

Stream differ from collection in several ways, Streams are Functional in nature, Laziness-seeking, Possibly Unbounded, Consumable.

# Stream Operations types 
## Terminal Operations  
Terminal operations, such as Stream.forEach or IntStream.sum, may traverse the stream to produce a result or a side-effect. 
After the terminal operation is performed, the stream pipeline is considered consumed, and can no longer be used; 
if you need to traverse the same data source again, you must return to the data source to get a new stream.

```java
IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
intStream.forEach(System.out::println);
System.out.println(intStream.count()); //Results error, as the stream already been consumed through forEach().
```

## Intermediate Operations  
Intermediate operations return a new stream. They are always lazy; executing an intermediate operation such as filter() does not actually perform any filtering, 
but instead creates a new stream and returns. Intermediate operations do not produce a final result directly, they are usually combined using method chaining.
Traversal of the pipeline source does not begin until the terminal operation of the pipeline is executed.

```java
    IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //filter() is an intermediate operation, returns a stream.
    IntStream evenStream = intStream.filter(value -> value % 2 == 0);
    evenStream.forEach(System.out::println);
    System.out.println(intStream.count());   //This results error since stream has already been operated upon or closed.
```

Intermediate operations are further divided into stateless and stateful operations.   
**Stateless operations**, such as filter and map, retain no state from previously seen element when processing a new element -- each element can be processed independently of operations on other elements.   
**Stateful operations**, such as distinct and sorted, may incorporate state from previously seen elements when processing new elements. 

## Short Circuit Operations  
An intermediate operation is short-circuiting if, when presented with infinite input, it may produce a finite stream as a result.  
A terminal operation is short-circuiting if, when presented with infinite input, it may terminate in finite time.   
Having a short-circuiting operation in the pipeline is a necessary, but not sufficient, condition for the processing of an infinite stream to terminate normally in finite time.  
