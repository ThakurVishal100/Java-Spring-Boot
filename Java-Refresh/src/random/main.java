package random;

public class main {
    public static void main(String[] args) {
        Integer x=1;
        Integer y=1;
        System.out.println(x==y);  // true            == checks object reference equality
        //   java catches range of integer objects from -128 to 127 to reuse the reference objects
        //  java has in built caching mechanism
        //   for larger values
        Integer a=1000;
        Integer b=1000;
        System.out.println(a==b);   //  false          .equals check value equality
        System.out.println(a.equals(b));
    }
}
