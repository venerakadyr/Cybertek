package mockInterview;

public class IntPalindrome {

    public static void main(String[] args) {
        numberPalindrome(5678);
    }
    public static void numberPalindrome(int number) {
        int reverse = 0;
        int newNumber = number;
        while (newNumber > 0) {
            int lastDigit = newNumber % 10; //5445 //0110   when you % 10 give last number
            reverse  =lastDigit+ reverse * 10;  // 5
            newNumber = newNumber / 10;
        }
        if(number==reverse){
            System.out.println("Number is palindrom");
        }else {
            System.out.println("Number is not Palindrom");
        }
    }
}


