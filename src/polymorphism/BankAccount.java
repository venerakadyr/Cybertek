package polymorphism;

public class BankAccount extends PaymentMethod {
    @Override
    public void charge( double amount){
        System.out.println("\n You charged in bank Account "+ amount);
        System.out.println("Fee apllied + $3");

    }


    @Override
    public void refund(double amount){
        System.out.println("Your refund in Bank Acoount "+amount);
    }

}
