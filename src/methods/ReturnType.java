package methods;

public class ReturnType {
    public static int getThree(){
        return 3;
    }
public static String getDate(){
        String date="11/3/2019";
        return date;
}


    public static void main(String [] args){
        int a =getThree()+7;
        System.out.println(a);
        System.out.println(getThree());
//
        System.out.println(getDate());
         String change= getDate().replace("/","*");
        System.out.println(change);
    }
}
