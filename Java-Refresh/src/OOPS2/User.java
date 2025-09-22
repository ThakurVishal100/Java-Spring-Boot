package OOPS2;

public class User {
     String username;
     String email;
    public User(String username,String email){
        this.username=username;
        this.email=email;
    }
    public void login(){
        System.out.println(this.username+ " "+"logged in");
    }
    public void showDashboard(){
        System.out.println("This is User dashboard");
    }
}
