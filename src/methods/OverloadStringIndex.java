package methods;

public class OverloadStringIndex {
    public static void main(String[] args) {
       firstChar("pumbik",0);


    }

    public static  void  firstChar(String str, int index){
        System.out.println(str.charAt(index));

    }
    public static int firstChar(String str, int indexOne, int indexTwo ){
      return str.substring(indexOne,indexTwo).length();
    }







}
