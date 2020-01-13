package inheritancePart2;

import static methodOverriding.BankAccountPublic.*;


import classes.BankAccount;
import inheritance.Huskey;
import methodOverriding.BankAccountPublic;

public class Laptop {

       String model;
        int memorySize;
        protected String color;


        public static int numOfLaptops;




        static {
            numOfLaptops=68;
        }
        public Laptop(String model){
            this.model = model;
        }

        public Laptop(){

        }



        public static void s() {
            System.out.println("static method in Laptop");
        }
        public  static void s( String name){
                System.out.println("static method in Laptop"+name);
            }



        protected void turnOn(){
            System.out.println("Laptop is turning on");
        }

        public void turnOn(String name){
            int age = 34;
        }

        public static void main(String[] args) {
//            money -= 900;
//            System.out.println(money);
        }
    }





