package exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class Phone {

        double version;
        String brand;
        int [] numbers;

        public static void main(String[] args) {
//Task: Make a class for Phone with instance variables of version, brand, contacts
//
//Ask the user to enter their phone information.
//version (double)
//brand (String)
//contacts (int [] of -> numbers)
//-> ask the user how many numbers they want to add, and allow them to add that many
//--------------------------------------------------------------


            Scanner input = new Scanner(System.in);
            Phone phone = new Phone();

            try{
                System.out.println("Enter your phones version");
                phone.version = input.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println("Invalid version entered");
            }
            input.nextLine();
            System.out.println("Enter your brand");
            phone.brand = input.nextLine();


            try{
                System.out.println("How many numbers do you want to enter");
                int [] nums = new int [input.nextInt()];
                input.nextLine();

                for(int i=0; i < nums.length; i++) {
                    try {
                        System.out.println("Enter number " + (i+1));
                        nums[i] = input.nextInt();
                        input.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid number, not stored, try again");
                        break;
                    }
                }

                phone.numbers = nums;


            } catch (InputMismatchException e) {
                System.out.println("Entered incorrect number amount");
            }

            try{
                System.out.println(Arrays.toString(phone.numbers));
            }catch (NullPointerException e) {
                System.out.println("No numbers");
            }
            System.out.println(phone.brand);
            System.out.println(phone.version);

        }
    }

