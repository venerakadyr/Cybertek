package methodOverriding;

public class SavingAccount extends BankAccountPublic {
   public double interestIncome;

    @Override
    public void transfer(double amount) {
        if ((amount + (amount % 20)) < this.balance) {
            amount = amount + (amount % 20);
            this.balance -= amount;
        } else {
            System.out.println("Not enough money ");
        }
    }

     @Override
    public void info(){
         super.info();
         System.out.println("Interest income: "+this.interestIncome);
     }

     public void calculateAnnualInterestIncome(){
        this.interestIncome=this.balance*0.03;
     }


    @Override
    public String toString() {
        return "SavingAccount balance: " + this.balance + "\n SavingAccount interestIncome: " + this.interestIncome + "\n SavingAccount name: " + this.name;
    }

    public static void main(String[] args) {
//        System.out.println(money);
    }
    }
