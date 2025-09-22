package OOPS1;


//   constructor overloading

public class Main2 {
    int i;
    int j;

    Main2(int i,int j){
        this.i=i;
        this.j=j;
    }
    Main2(int i){
        this(i,i);
    }
    Main2(){
        this(0);
    }
    @Override
    public String toString(){
        return this.i+" "+this.j;
    }
    public static void main(String[] args) {
        Main2 obj=new Main2();
        System.out.println(obj);
    }
}
