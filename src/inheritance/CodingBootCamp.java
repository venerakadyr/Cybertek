package inheritance;

public class CodingBootCamp extends School {
    public static void main(String[] args) {
        CodingBootCamp cybertek=new CodingBootCamp();
        cybertek.name="Cybertek";
        cybertek.address="Chicago";
        cybertek.giveHW();
        cybertek.hostEvent("OCtober",25,2020);


    }

}
