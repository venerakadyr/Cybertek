package polymorphism;

import java.util.ArrayList;

public class SchoolAccountingDep {
    public static void main(String[] args) {
        PaymentMethod pm1=new BankAccount();
        PaymentMethod pm2=new PayPal();
        PaymentMethod pm3=new CreditCard();
        PaymentMethod pm4= new PayPal();
        PaymentMethod pm5=new BankAccount();


        ArrayList <PaymentMethod> studentsPayment= new ArrayList<>();


        studentsPayment.add(pm1);
        studentsPayment.add(pm2);
        studentsPayment.add(pm3);
        studentsPayment.add(pm4);
        studentsPayment.add(pm5);

        for(PaymentMethod p: studentsPayment){
            p.charge(500);
        }


    }
}
