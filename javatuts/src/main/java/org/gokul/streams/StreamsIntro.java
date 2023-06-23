package org.gokul.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamsIntro {

//    why do we need streams in java?
//    scenario: before we had streams if we want to find sum of numbers from a list whose greater than 10,

//    public static int findSumOfNumbersGreaterThan10(List<Integer> list){
//
//        Iterator<Integer>it= list.iterator();
//        int sum=0;
//
//        while(it.hasNext()){
//            int num = it.next();
//            if(num>10){
//                sum+=num;
//            }
//        }
//        return sum;
//    }

//    so we could write the same logic in very less code using streams
    public static int findSumOfNumbersGreaterThan10(List<Integer>list){
        return list.stream().filter(n-> n>10).mapToInt(i->i).sum();
    }


//    collection vs java streams
//    Collection is an in memory data-structure holding values. Inorder to use collections, we need to have the collection,
//    pre-populated with values.
//    whereas streams is a data-structure computed on demand. They do not store data rather they operate on the source
//    data-structure, and produce a pipelined data on top which a variety of operations can be performed. like we could
//    create a stream from a list, and we could do some filter on some conditions. It uses functional interfaces which
//    helps in making functional programming easy. Internal iteration helps lazy implementation for methods like
//    filtering,mapping,or duplicate removal. Streams cannot be usable for future use. As the data is on-demand, there is
//    no way to use it multiple times. Streams support parallel and sequential processing making large collection operations
//    much faster.
//

//    java stream Intermediate and terminal operations
//     that returns a new stream is intermediate operation. They are lazy and the new stream is passed to the next operation
//    commonly used are filter, map etc.
//    operations that returns a result or creates a side effect is terminal operation. They are eager in nature. commonly
//    used terminal operations are forEach,toArray,min,max,findFirst,anyMatch,allMatch.

//    Short-circuiting operations
//    An intermediate operation is called short-circuiting, if it may produce finite stream for an infinite stream.
//    For example limit() and skip() are two short-circuiting intermediate operations. A terminal operation is called
//    short-circuiting, if it may terminate in finite time for infinite stream. For example anyMatch, allMatch,
//    noneMatch, findFirst and findAny are short-circuiting terminal operations.

    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,3,11,5,6,20,15);

        System.out.println(findSumOfNumbersGreaterThan10(list));

//

    }
}
