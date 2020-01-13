package exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
//        Task:
//Create an array with values {1,2,3,4,5}
//Ask user to enter the index they want to change, and then the number they want to change that element to.
//Case: User could enter an index that doesnt exist
//Case: User could enter a character instead of the index they want to change or a character instead of the number they want to change it to




    Scanner input=new Scanner(System.in);
    int [] arr={1,2,3,4,5};


    try{
        System.out.println("Enter index you want to cahnge");
        int index=input.nextInt();
        System.out.println("Enter number you want to add");
        int num=input.nextInt();
        input.nextLine();
        arr[index]=num;

    } catch (InputMismatchException e) {
        System.out.println("Invalid number entered");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Entered an invalid index");
    } finally {
        System.out.println(Arrays.toString(arr));
    }











    }
}
