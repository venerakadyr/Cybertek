package methods;

public class DataTransfer {
    public static void main(String [] args){
        printName("James");
        firstChar("Carrol");

 goTo("bishkek", "parish");


 makeEmail("venera", "kadralieva", 29);

    }
      public static void printName(String name ){
        System.out.println(name);
      }

    public static void firstChar(String name) {
        System.out.println(name.charAt(0));

    }

  public static void goTo(String origin, String newLocation){
      System.out.println("You start from "+origin);
      System.out.println("And you are going to "+ newLocation);

  }

  public static void makeEmail(String firstNmae, String lastName, int age){
        String email=firstNmae+age+lastName+"@cybertek.com";
        System.out.println(email);
  }

}
