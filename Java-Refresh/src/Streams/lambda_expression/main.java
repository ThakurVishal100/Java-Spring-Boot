package Streams.lambda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        sumoperation add=(a,b)-> a+b;
        sumoperation subt=(a,b)->a-b;
//        System.out.println(add.operation(2,3));

//        predicate is a Interface ( boolean valued function )
        Predicate<Integer> iseven =x->x%2==0;
//        System.out.println(iseven.test(2));

        Predicate<String> startsWithA=x->x.toLowerCase().startsWith("a");
        Predicate<String> endsWithT=x->x.toLowerCase().endsWith("t");
        Predicate<String> and=startsWithA.and(endsWithT);
        System.out.println(and.test("amant"));
        System.out.println(and.test("aman"));

//        Functions--> it is a functional interface


//        method reference

        List<String> list = Arrays.asList("Ram", "shyam", "aman");
        list.forEach(x-> System.out.println(x));
        list.forEach(System.out::println);


//        constructor reference

        List<String> list1 = Arrays.asList("A", "B", "C");
        List<MobilePhone> collect = list1.stream().map(MobilePhone::new).collect(Collectors.toList());
        System.out.println(collect);
    }


}

class MobilePhone{
    String name;
    MobilePhone(String name){
        this.name=name;
    }
}

@FunctionalInterface
 interface sumoperation{
    int operation(int a, int b);
}
