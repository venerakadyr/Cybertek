package inheritance;

public class School {
    String name;
    String address;
    String type;



    public  void giveHW(){
        System.out.println(this.name+" is giving homework");
    }

    public void hostEvent(String month, int day, int year){
        System.out.println("Hosting an event "+month+" "+day+", "+year);
    }

}
