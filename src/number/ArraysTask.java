package number;

public class ArraysTask {
    public static void main(String[] args) {


//        Create String array size of 4;
//        Store 4 names in that array. Give a proper name for your array variable.
//                Make sure to assign value for every single index.
//                Print out second and third names on separate lines.
//     solution1-  String []name= new String[4];
//        System.out.println(Arrays.toString(name));
//        name [0]= "k";
//        name [1]="A";
//        name[2]="f";
//        name[3]="g";
//        System.out.println(Arrays.toString(name));
//        for(int i =0; i < name.length; i++) {
//            System.out.println("name " + i + " is " + name[i]);
//        }
//
//           //System.out.println("name " + (i + 1) + " is " + names[i].charAt(0));

//======================================================================================================================
//Declare and initialize double array for prices.
//Store following prices:
//45.99, 23.5, 11.50, 33.33, 99.99.
//Print the values then change the last element to 112.89.
//Print all values again
//        double [] prise={45.99,23.5,11.50,33.33,99.99};
//        prise[prise.length-1]=112.89;
//        System.out.println(Arrays.toString(prise));
//

//Create String array for the colors.
//Initialize 4 colors.
//Loop through each element using for loop and print each color names.
//      String [] colors={"pink","red","blue","yellow"};
//        System.out.println(Arrays.toString(colors));
//         for ( String color:colors){
//             System.out.println("*"+color);
//*pink
//*red
//*blue
//*yellow
//        for(int i=0; i<colors.length; i++){
//            System.out.println(colors[i]+" is "+i);
//        }
//         }
//pink is 0
//red is 1
//blue is 2
//yellow is 3
//==================================================================================================================

//        Create String array for students. Initialize with students below: James, John, Adam, Elize, Jamie, Benzema
//Loop through each elements of students. - print first character of each name on each line.
//- Part II * Modify the loop and print the player names whose name ends with "s";
//- Part III * Modify and print the player if it contains "s"
//Part IV * Read the String from the user using Scanner and print out the players that contains the entered String keyword by user.
//

//    String[] students = {"James", "John", "Adam", "Elize", "Jamie"};


//        for (int i = 0; i < students.length; i++) {
//        part I      str+=students[i].charAt(0);
// String str = "";====> declare str variable to store
//        }System.out.println(str);  output-//  JJAEJ

//     PartII  for (int i = 0; i < students.length; i++)
//             if  (students[i].endsWith("s")){
//             System.out.println(students[i]); =====> output James
//         }


//     partIII  for (int i = 0; i < students.length; i++)
//              if (students[i].contains("s")) {
//               System.out.println(students[i]);
//
//            }=====> output James

//     PartIV

//        Scanner input=new Scanner(System.in);
//        String letter=input.nextLine().toLowerCase();
//        for (int i = 0; i < students.length; i++) {
//
//            if (students[i].contains(letter)) {
//                System.out.println(students[i] + " contains " + letter);
//            }
//        }
//
//        }


//        String[] students = new String[7];
//        students[0] = "James";
//        students[1] = "Sam";
//        students[2] = "Adam";
//        students[3] = "Elize";
//        students[4] = "jamie";
//        students[5] = "Benzena";
//        students[6] = "Sandy";
//
//        for (int i = 0; i < students.length; i++) {
////       System.out.println(students[i].charAt(students[i].length()-1));
//            int last = students[i].length() - 1;
//            System.out.println(students[i].charAt(last));
//                }
//
//        for (int i = 0; i < students.length; i++) {
//                if (students[i].toLowerCase().endsWith("s")) {
//                    System.out.println(students[i]);
//                }
//            }
//
//        System.out.println();
//
//
//        for (int i = 0; i < students.length; i++){
//            if(students[i].toLowerCase().contains("s")){
//                System.out.println( students[i]);
//            }
//        }
//
//
//            System.out.println();
//
//            System.out.println("Enter a string");
//            Scanner input = new Scanner(System.in);
//            String user = input.nextLine();
//
//            for (int i = 0; i < students.length; i++) {
//                if (students[i].toLowerCase().endsWith(user)) {
//                    System.out.println(students[i]);
//
//
//                }
//
//
//            }
//==================================================================================================================

//        5) Write a program that will ask user to enter 5 names.
//        Take each name and store all the names into an array. Print the array

//        Scanner input = new Scanner(System.in);
//        System.out.println("how many names you wants to enter");
//        int size = input.nextInt();
//        input.nextLine();
//
//
//        String[] names = new String[size];
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("enter a names " + (i+1));
//            names[i] = input.nextLine();
//        }
//        System.out.println(Arrays.toString(names));
//
//    }


//           Scanner input = new Scanner(System.in);
//        System.out.println("how many names you want to print?");
////        first we gonna find out how many names user wants to enter
//        int size=input.nextInt();
//        input.nextLine();
////        breaking the line between int and string
//            String [] names= new String[size];
//
//           for (int i = 0; i <names.length; i++) {
//               System.out.println("Enter name" + (i + 1));
//               names[i] = input.nextLine();
//           }
//        System.out.println(Arrays.toString(names));
//================================================================================================================

//        6) Create an array with 50 random numbers in the range of 1-100. Then print the array

//
//       Random random=new Random();
//
//        int  [] number2=new int[50 ];
//        for (int i = 0; i <number2.length; i++) {
//            int number = random.nextInt(100) + 1;
////       declare a new variable number, it gonna generate 50 numbers between 1-100
//            number2[i] = number;
//        }
//        System.out.println(Arrays.toString(number2));
//
//        }
//============================================================================================================
//    Task7)    Given an array with values of: 1,2,-3,4,-34,55,78,90,33,10
//        Take our all the even numbers from the array and put them into a new array. Print the new array


//
//      int num2 = 0;
//
//        int[] arr = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] % 2 == 0) {
//                num2++;
//            }
//        }
//
//        int[] newArr = new int[num2];
//        for (int i = 0, j = 0; i < arr.length; i++) {
//            if (newArr[i] % 2 == 0) {
//                     newArr[j] = arr[i];
//                j++;
//
//            }
//        }
//        System.out.println(Arrays.toString(newArr));
//
//    }
//}

//============================================

//      Given numbers of 3,30,14,6,50,20
//     Find and print the biggest number

//        int[] arr = {3, 30, 14, 6, 50, 20};


//      int [] number={3,30,14,6,50,20};
//      int max=number[0];
////      int max is == to first number3, showing the first index. if we put 0, its gonna be ok this time,
////      but if the number is gonna be -3 so will be error
//      for (int i=1; i<number.length;i++){
//            if(number[i]>max){
//                max=number[i];
//            }
//      }
//        System.out.println(max);
//
//
//            }


    }

}



