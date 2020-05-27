package abstraction;

public class tsr {
    static void doIt( int x, int y, int m){
        if(x==5){
            m=y;
        }else {
            m=x;
        }

    }

    public static void main(String[] args) {


        int i = 6;
        int j = 4;
        int k = 9;
        {
            if (i == 5) {
                k = j;
            } else {
                k = i;
            }

            System.out.println(k);
        }


    }

}
