package stringBuilder;

public class IsPolindrome {
    public static Boolean isPolindrome(String str){
        str.replace(" ","");
        StringBuilder pl=new StringBuilder(str);
        pl.reverse();
       String  str1=pl.toString();
        if(str.equalsIgnoreCase(str1)){
            return true;
        }

        return false;


    }

    public static void main(String[] args) {
        System.out.println(isPolindrome("venbers"));
    }
}
