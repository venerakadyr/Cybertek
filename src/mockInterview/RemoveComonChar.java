package mockInterview;

public class RemoveComonChar {
    public static void main(String[] args) {
        String str1="java";
        String str2="apple";
        String helper="";

        for(int i=0; i< str1.length();i++){
            if(str2.contains(str1.charAt(i)+"")){
//            str2+=str2.replace(str2.charAt(i)+"", "");
                helper+=str1.replace(str1.charAt(i)+"", "");

            }

        }

        System.out.println(helper);
    }


}
