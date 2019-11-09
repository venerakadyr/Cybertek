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
            int a, b, c, d, e;
            a = 1;
            while (a <= 500) {
                b = a % 10;
                c = a / 10;
                d = c % 10;
                e = c / 10;
                if (a == e * e * e + d * d * d + b * b * b)
                    System.out.println(a);

                a++;
            }


        }


    }

