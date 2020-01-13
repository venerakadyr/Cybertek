package staticClass;

public class Lexus {
    String model;
    int year;
    String color;
    double mileage;
    boolean newOrNot;
   static int totalNumOfLexus;


   public Lexus(String model, int year){
       this.model=model;
       this.year=year;
       totalNumOfLexus++;


   }


   public static double mileToKm(double mile){
//   double km=(mile/5)*8;
//   return km;
       return mile*1.6;
   }

public static void evaluateCar(Lexus car){
       int age=2019-car.year;
    if(car.mileage<50000&&age<3){
        System.out.println("Best Choice");
    }else if((car.mileage>50000 &&car.mileage<100000) &&(age>3 &&age<7)){
        System.out.println("Fair Choice");
    }else if(car.mileage>100000&&car.mileage<200000){
        System.out.println("You decide");
    }else if(car.mileage>200000){
        System.out.println("Stay away");

    } else{
        System.out.println("Not able to evaluate");
    }
}








}
