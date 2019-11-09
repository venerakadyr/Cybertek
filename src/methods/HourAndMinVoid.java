package methods;

public class HourAndMinVoid {
    public static void main(String[] args) {

      printTheTime(5, 43, true);
    }
    public static void printTheTime(int hrs, int min, boolean check){

        if((hrs>0&&hrs<13)&&(min>=0&&min<60)){
            String date=hrs+" : "+min;
            if(check){
                date+=" AM";

            }else{
                date+=" PM";
            }
            System.out.println(date);


        }else{
            System.out.println("Invalid number");

        }



    }




}
