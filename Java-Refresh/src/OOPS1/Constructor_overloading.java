package OOPS1;

public class Constructor_overloading {
    String language;
    Constructor_overloading(){
        language="c";
    }
    Constructor_overloading(String lang){
        language=lang;
    }
    void getName(){
        System.out.println("language is" +" "+ language);
    }

    public static void main(String[] args) {
        Constructor_overloading obj=new Constructor_overloading("java");
        obj.getName();
    }
}
