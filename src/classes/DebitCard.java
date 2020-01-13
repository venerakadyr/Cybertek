package classes;

import com.sun.jdi.IntegerValue;
//Warm up:
//Create a class for Debit Card that has the following instance variables: card number (long), holder name (String), card type (String), pin (int) , and balance (double)
//Create an info method that will print all of the cards information (Except the pin). If the card type does not have a value do not print that line.
//Click to expand inline (9 lines)
//
//
//
//
//
//
//
//Message #cybertek-batch14
//
//
//Thread
//cybertek-batch14

public class DebitCard {
    long number;
    String name;
    String cardType;
    int pin;
    double balance;
    public DebitCard(long number,String name, double balance){

       if (String.valueOf(number).length()==16){
           this.number=number;
       }else{
           System.out.println("Invalid number");
       }


        this.name=name;
        this.balance=balance;


    }


    public DebitCard(long  number, String name, String cardType,int pin, double balance){
//      this.number=number;
//      this.balance=balance;
//      this.name=name;
      this(number,name,balance);

        if(!cardType.equalsIgnoreCase("MasterCard")||!cardType.equalsIgnoreCase("Visa")){
            System.out.println("Invalid card");
        }
       this.cardType=cardType;


        if(pin+"".length()!=4){
            System.out.println("Invalid pin");
        }else{
            this.pin=pin;
        }






    }



    public void info(){
        System.out.println("Number: "+this.number);
        System.out.println("Name: "+this.name);
        System.out.println("Balance: "+this.balance);


        if(cardType!=null){
            System.out.println("Card type is "+cardType);
        }
    }


}
