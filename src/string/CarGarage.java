package string;

public class CarGarage {
    public static void main(String[] args) {


// You have a car garage with these car brands.
// You will check the cars and print the following messages:>
// If the garage is empty print “No cars in your garage” >
// If you have a Toyota or Nissan print “There is a Japanese car in your garage”> If you have a
//  BMW print “There is a German car in your garage”> If you have
// a Maserati print “There is an Italian car in your garage”> If you have a Jaguar print
// “There is a British car in your garage”—>
// If the garage does not have a car of that type, print “No xcars”


         String carGarage = "Toyota,BMW,Maserati,Nissan,Jaguar";
         carGarage=carGarage.toLowerCase();

         if (carGarage.isEmpty()){
             System.out.println("Garage is empty");
         }

         if (carGarage.contains("Toyota")||carGarage.contains("Nissan")) {
            System.out.println("There is a Japanese car in your garage");
                }else{
             System.out.println("No Japanese cars");
             }
         if (carGarage.contains("BMW")){
            System.out.println("There is a German car in your garage");

                 }else {
                System.out.println("No German cars");
              }

         if(carGarage.contains("Maserati")){
            System.out.println("There is an Intalian car in your garage" );

               }else {
                System.out.println("No Italian cars");
            }


         if(carGarage.contains("Jaguar")){
            System.out.println("There is a British car in your garage");
          } else{
            System.out.println("No Jaguar cars");
        }



    }
}
