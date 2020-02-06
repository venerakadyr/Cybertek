package mockInterview;

public class RemoveComonChar {
    public static void main(String[] args) {

//        for(int i=0; i< str1.length();i++){
//            if(str2.contains(str1.charAt(i)+"")){
//            str2=str2.replace(str2.charAt(i)+"", "");
//            str1=str1.replace(str1.charAt(i)+"","");
//                helper+=str1.charAt(i)+"";
//             i--;
//            }
//
//        }
//
//        System.out.println(str1 +"\n"+str2+"\n"+helper);

        String s1="java";
        String s2="apple";
        String helper="";
//
        String commonChars = "";

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    commonChars += s1.charAt(i);
                }
            }
        }

        for (int i = 0; i < commonChars.length(); i++) {
            String charToRemove = commonChars.charAt(i) + "";
            s1 = s1.replace(charToRemove, "");
            s2 = s2.replace(charToRemove, "");
        }
        System.out.println("After removing common character " + s1);
        System.out.println("After removing common character " + s2);
        System.out.println(commonChars);
    }


}
