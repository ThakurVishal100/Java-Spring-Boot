package OOPS2;

public class AdminUser extends User{
    public AdminUser(String username,String email){
        super(username,email);
    }
    public void manageProducts(){
        System.out.println("admin is managing products");
    }
    @Override
    public void showDashboard(){
        super.showDashboard();
        System.out.println("This is Admin dashboard");
    }

    public static void main(String[] args) {
        AdminUser au=new AdminUser("aman","aman@gmail.com");
//        au.login();
        au.showDashboard();
    }

}
