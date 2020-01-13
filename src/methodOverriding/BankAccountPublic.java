package methodOverriding;

import classes.BankAccount;

public class BankAccountPublic {
//  Create a class BankAccount  Public instance variables: balance, accountNumber, name  methods:  info: This method shows the details of the BankAcount.
//  Print balance, account number and name in this method implementation.  transfer: This method accepts double and doesn’t return anything.
//  Method should subtract the amount given and 10% of given amount as a transfer fee.   deposit: Method accept double and adds this amount to the balance.   
//Create a class CheckingAccount.   Extend this class to BankAccount.   override the method transfer.
// Checking account’s transfer should be only 5% fee for transferring. Special case: Check if balance is enough.
// If not enough give proper message and don’t transfer. 
//Create a class SavingsAccount.  Add interestIncome instance variable. Extend it to BankAccount.   
// Override the transfer here as well. SavingsAccount transfer should be 20% fee.  Override info method.
// Change the implementation and print all the info including interestIncome information as well.  
//  Create additional method calculateAnnualInterestIncome. 3% of the current balance should go to interestIncome. 
//  Override Object class’s toString method. Build a proper String with all instance variables and return the string. 
   public  double  balance;
   public  double accountNumber;
    String name;



   public void info(){

       System.out.println("Name: "+this.name);
       System.out.println("Bank account number: "+this.accountNumber);
       System.out.println("Balance: "+this.balance);

   }

   public static void bobby( int money ){
       System.out.println(money);
   }

    public  void transfer( double amount){
        System.out.println("Balance transfered:"+amount);
        this.balance-=amount;
        this.balance=amount+(amount*0.1);


    }
    public void deposit(double deposit){
       this.balance+=deposit;
        System.out.println("Balance deposited: "+deposit);
    }






}
