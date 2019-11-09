package methods;

import javax.swing.*;

public class IsWeekDaysReturn {
//    Write a method that will tell you if it is the weekday or not.
//    The method takes a String, Saturday and Sunday are the only weekend days
    public static boolean weekDays(String days) {
      days=days.toLowerCase();


      switch( days){
          case"monday":
          case"tuesday":
          case"wednesday":
          case"thursday":
          case"friday":
              return true;
          case"saturday":
          case"sunday":
              return false;
          default:
              System.out.println("invalid day provided");
              return false;

      }

        }







    public static void main (String[]args){
        System.out.println(weekDays("Monday"));

    }



}