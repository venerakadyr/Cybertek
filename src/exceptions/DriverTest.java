package exceptions;

public class DriverTest {
    public static void main(String[] args)  {

        Driver d=new Driver();
        try {
            d.setName("venerakadralieva ");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(d.getName());

    }
}
