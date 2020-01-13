package mockInterview;

import com.sun.jdi.IntegerValue;

public class SumIntInAString {
    public static void main(String[] args) {
        String str="989dhjdfjsf8";
        int sum=0;
         for(int i=0;i<str.length();i++){
             char tem=str.charAt(i);
             if(Character.isDigit(tem)){
//                 ascii table is between range
                 int b= Integer.parseInt(String.valueOf(tem));
                 sum+=b;
             }
         }
        System.out.println(sum);
    }
}
