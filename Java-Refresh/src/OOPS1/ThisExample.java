package OOPS1;

public class ThisExample {
    int x;
    int y;
    ThisExample(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println(this.x+" "+this.y);
        add(this);
        System.out.println(this.x+" "+this.y);
    }
    public void add(ThisExample o){
        o.x+=3;
        o.y+=5;
    }

    public static void main(String[] args) {
        ThisExample onj=new ThisExample(1,2);

    }
}
