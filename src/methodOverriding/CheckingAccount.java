package methodOverriding;

public class CheckingAccount extends BankAccountPublic {


    int accountNumber;

    @Override
    public void transfer(double amount) {
        if ((amount + (amount* 0.05)) <= this.balance) {
            amount = amount + (amount * 0.05);
            this.balance -= amount;
        }else{
            System.out.println("Not enough money ");

        }

    }


    public static void bobby(int money){
         System.out.println();

     }




    }

