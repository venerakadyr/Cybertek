package mockInterview;

public class ArmstrongNumber {
//    public static boolean isArmstrongNumber(long number) {
//
//
//            int a, b, c, d, e;
//            a = 1;
//            while (a <= 500) {
////                int a =157;
//                b = a % 10;
//                c = a / 10;
//                d = c % 10;
//                e = c / 10;
//                if (a == e * e * e + d * d * d + b * b * b){
//                }
//            }
//
//
//                a++;
//
//return null;
//    }
public static boolean isArmstrongNum(long number) {
    String num = number + "";
    //turning to string to get the length that will be the power we will multiply
    int power = num.length();
    int sum = 0;
    //loop through each number to mutiply
    for (int i = 0; i < num.length(); i++) {
        //parse str into int so we can math manupulation
        int digit = Integer.parseInt(num.charAt(i) + "");
        //ready matheds from java
        sum += Math.pow(digit, power);
    }
    return sum == number;
}
    public static void main(String[] args) {

    long number=153;

    String strNumber=number+"";
    int power=strNumber.length();
    int sum=0;

    for(int i=0;i<strNumber.length();i++){
        int digit=Integer.parseInt(strNumber.charAt(i)+"");
        sum+=Math.pow(digit,power);
        System.out.println(sum);
    }

  if(sum==number){
      System.out.println(number+" is Armstrong number");
  }

    }

}