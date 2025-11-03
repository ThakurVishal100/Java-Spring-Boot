package Streams.lambda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamClass {
//    Stream introduced in java 8
//    through which we process collections of data  in a functional and declarative manner
//    simplify data processing
//    embrace functional programming
//    improve readability and maintainability
//    enable easy parallelism
    
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        System.out.println(list.stream().filter(x->x%2==0).count());

//        System.out.println(Stream.generate(()->1));

//        System.out.println(Stream.iterate(1,x->x+1));

//        intermediate operations transforms a stream into another stream
//        they are lazy meaning they dont execute until a terminal operation is invoked

//        count is a terminate method
//        collect is also a terminate method

        List<String> list1 = Arrays.asList("aman", "kunal", "vaibhav");
//        System.out.println(list1.stream().filter(x->x.startsWith("a")).count());

        List<Integer> list2 = Arrays.asList(1, 2, 3);
//        System.out.println(list2.stream().reduce((x,y)->x+y).get());


        List<Integer> list3 = Arrays.asList(3, 5, 7, 8);
//        System.out.println(list1.stream().filter(x->x.length()>3).toList());

//        System.out.println(list3.stream().map(x->x*x).sorted().toList());

//        System.out.println(list.stream().reduce(Integer::sum).get());

        //   coutn ocurence of characters

        String name="Hello World";
        System.out.println(name.chars().filter(x->x=='l').count());




    }


}
