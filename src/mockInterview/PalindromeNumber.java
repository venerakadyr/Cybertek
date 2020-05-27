package mockInterview;

public class PalindromeNumber {
    public static boolean isPalindromeNumber(long number){
      long workingNum=number;
      long reverse=0;
//      num%10===> gives us last digit
        while(workingNum!=0){
            long last=workingNum%10;
            reverse=reverse*10+last;
            workingNum/=10;

        }

        return true;
    }

    public static void main(String[] args) {
        isPalindromeNumber(18890);
    }




}
