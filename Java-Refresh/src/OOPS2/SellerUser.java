package OOPS2;

public class SellerUser extends User{
    public SellerUser(String username,String email){
        super(username,email);
    }
    public void addProducts(){
        System.out.println("seller add the products");
    }
    @Override
    public void showDashboard(){
        System.out.println("This is Seller dashboard");
    }
}
