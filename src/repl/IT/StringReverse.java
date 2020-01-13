package repl.IT;

public class StringReverse {
    public static void main(String[] args) {


        String s = "hello";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

////           String reversed= new String(arr) method turn array to string
        }String reversed = new String(arr);
        System.out.println(reversed);

//        String reverse=newStringBuilder(s).reverse().toString();




    }
       public static String reverseStringSwap(String s){
        return new StringBuilder(s).reverse().toString();
//        return new StringBuilder(s).reverse().toString();   to reverse
    }

}