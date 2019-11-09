package homeTask;

public class ForWhile {
    public static void main(String[] args) {


//        Write for and while loops so that they go through the odd integers (from 1 to 19),
//        keeping track of the sum of these integers at each stage, and printing the sum at each stage.
//
//        Expected Output:  1 4 9 16 25 36 49 64 81 100
//
//
////

//        int sum = 0;
//
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0)
//                sum += i;
//        }
//            System.out.print(sum + " ");


// Print numbers between 1 and 20 in a way that:
//a. numbers are printed with plus signs between them and a space on either side,
//b. there should be no plus sign or space before the first number and after the last number
//Expected Output:  1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20

//               for (int i=1;i<=20; i++)
//            if(i<=19){
//                System.out.print( i+ " + ");
//            }else if(i==20){
//                System.out.println(i);
//          comment sout("20")
//            }


//   Write for and while loops so that they print the square of each odd number from numbers between 1 and 20.
//Expected Output:  1 9 25 49 81 121 169 225 289 361
//     int sum=0;
//         for(int i=1;i<=20;i++)
//             if (i%2==1){
//             sum=i*i;
//                 System.out.print(sum +" ");
//         2 version=
//             }

//Task- Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
//Expected Output:  3 6 9 12 15 18


//        for(int i=3;i<=20;i+=3)
//
//                System.out.print(i+" ");


//Write for and while loops so that they print only the even numbers between 1 and 20.
//Expected Output:  2 4 6 8 10 12 14 16 18 20
        for (int i = 2; i <= 20; i += 2)

            System.out.print( i + " ");



    }

}




