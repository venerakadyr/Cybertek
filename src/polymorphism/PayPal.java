package polymorphism;

public class PayPal extends PaymentMethod{
    @Override
    public void charge(double amount) {
        System.out.println("\nYou charged in Paypal "+ amount);
        System.out.println("Fee apllied + $9");
    }

    @Override
    public void refund(double amount) {
        System.out.println("You refund in Paypal "+ amount);

    }
}
