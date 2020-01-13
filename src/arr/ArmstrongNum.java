package arr;

public class ArmstrongNum {
    public static void main(String[] args) {
//   Write a program to print out all Armstrong numbers between 1 and 500.
//   If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//for example:
//153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
//
//Output:
//1
//153
//370
//371
//407

//
//        {
//            int a, b, c, d, e;
//            a = 1;
//            while (a <= 500) {   int a =157;
//                b = a % 10;
//                c = a / 10;
//                d = c % 10;
//                e = c / 10;
//                if (a == e * e * e + d * d * d + b * b * b)
//                    System.out.println(a);
//
//                a++;
//            }


        String str = "*AAAab**cd*";
        String str1="";
        if(str.startsWith("*")){
            str=str.substring(2);
            if(str.endsWith("*")){
                str=str.substring(0,str.length()-2);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*'&&str.charAt(i+1) == '*'){
               str= str.substring(0,i-1 )+str.substring(i+3);
            }else if(str.charAt(i) == '*'){
                str= str.substring(0,i-1 )+str.substring(i+2);
            }
        }

        System.out.println(str1);
    }

}