package wednesdayClass;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
//    Create a void method  no arg countWords
//    Input from user
    public static void countWords(){
             //1- Print out the intro sentence
        Scanner input=new Scanner(System.in);
        System.out.println("Please, enter your sentence");
             //2- Accept a String from the user
        String sentence=input.nextLine();
              //3- Create a logic to process the String: split the String and store
        String [] arr=sentence.split(" ");
              //in another variable
              //4- Print out the elements of the String array
        System.out.println("This is the word: "+ Arrays.toString(arr));
              //5- Print out the length of the String array
        System.out.println("This is the length:  "+arr.length);
    }





    public static void login(){
//        0- Create test data
        String id="johnJava";
        String pass="123456";
        Scanner input=new Scanner(System.in);
        System.out.println("enter your login");
        String login=input.nextLine();
        System.out.println("enter your password");
        String password=input.nextLine();

        if(login.equalsIgnoreCase(id)&&password.equals(pass)){
            System.out.println("Successfully logged in");
        }else if(!login.equalsIgnoreCase(id)&&password.equals(pass)) {
            System.out.println("login fail");
        }else if(login.equalsIgnoreCase(id)&&!password.equals(pass)){
            System.out.println("Password fail");
        }else{
            System.out.println("check your credential");
        }

    }

    public static boolean isPalindrome(String str){
//        1- to create an empty string to store reverse value
        String reverse="";
//        2- create logic to reverse the string & store inside of the above mentioned string
        for(int i=str.length()-1;i>0;i--){
            reverse+=str.charAt(i);
        }
//        3- return value
        if(str.equals(reverse)){
            return true;
        }

        return false;

    }

    public static String resultCount(String str){

     String [] arr=str.split(" ");
      String noComma=arr[1].replace(",","");

    return noComma;

    }
    public static String resultTime(String str) {

        String[] arr = str.split(" \\(");

       String word=arr[1].replace(")","");
       return word;


    }

    public static boolean doesContain(String str){
//               String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit,
//               sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Risus
//               in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut.
//               Quisque non tellus orci ac. In nisl nisi scelerisque eu ultrices vitae auctor eu augue.";
        //1- Split with dot to get all sentences as a String array
        String [] strArr = str.split("\\.");
        //2- Check if sentence with index #2 contains massa
        String thirdSentence = strArr[2];
        if(!thirdSentence.contains("massa")){
            return false;
        }else
            return true;
        //3- return value
    }








public static void main(String[] args) {
        System.out.println(resultTime("About 1,180,000,000 results (0.48 seconds) "));

    }
}
