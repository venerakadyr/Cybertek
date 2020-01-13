package polymorphism;

public class CreditCard extends PaymentMethod {

@Override
    public void charge( double amount){
        System.out.println("\nYou charged in Credit Card "+ amount);
    System.out.println("Fee apllied + $7");
    }
@Override
    public void refund(double amount){
        System.out.println("Your refund in Credit card "+amount);
    }
}
