package homeTask;

import java.util.Arrays;

public class CharLength {
    public static void main(String[] args){




//    Given a string, take the last char and return a new string with
//    the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
//
//
//Input:
//Hello
//Output:
//oHelloo
//
//Input:
//a
//Output:
//aaa
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a word");
//        String word=input.nextLine();
//        char  last=word.charAt(word.length()-1);
//








//Write a program to find the factorial value of any number entered through the keyboard.
//
//
//Example:
//
//Input:
//5
//Output:
//Factorial: 120
 int [] nums={3,4};
        int mid=nums.length/2;
        if(nums.length>=3){
            if(nums[0]>nums[mid]&&nums[0]>nums[nums.length-1]){
                System.out.println( nums[0]);
            }else if(nums[mid]>nums[0]&&nums[mid]>nums[nums.length-1]){
                System.out.println(nums[mid]);
            }else if(nums[nums.length-1]>nums[0]&&nums[nums.length-1]>nums[mid]){
                System.out.println(  nums[nums.length-1]);
            }
        }else {}
            System.out.println(nums);
        }






    }

