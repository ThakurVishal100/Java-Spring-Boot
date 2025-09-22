package OOPS1;

public class Main {
    private String name;
    Main(){
        System.out.println("Constructor is called");
        System.out.println(this);
        name="aarav";
    }

    public static void main(String[] args) {
        Main main=new Main();
//        System.out.println(main.name);
        System.out.println(main);
    }
}
