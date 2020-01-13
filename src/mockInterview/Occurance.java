package mockInterview;

public class Occurance {
    public static void main(String[] args) {


        String str="apple";
      String helper="";

       for(int i=0 ;i<str.length();i++) {
           if (!helper.contains(str.charAt(i) + "")) {
              int count = 0;
             for (int j = i; j < str.length(); j++) {
                  if (str.charAt(i) == str.charAt(j)) {
                       count++;

                  }
                   helper += str.charAt(i) + "";
               }
             System.out.println(str.charAt(i) + " " + count);
           }
       }


    }
}
