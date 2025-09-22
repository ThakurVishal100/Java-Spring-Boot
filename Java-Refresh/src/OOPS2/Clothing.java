package OOPS2;

public class Clothing extends Product{
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return 0;
    }

    @Override
    double calculateTax() {
        return 0;
    }

    @Override
    double calculateShippingCost() {
        return 0;
    }
}

