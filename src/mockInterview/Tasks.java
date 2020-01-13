package mockInterview;

import java.util.ArrayList;

public class Tasks {

        public static int sumDigits(String str) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i)))
                    sum += Integer.parseInt(str.charAt(i) + "");
            }
            return sum;
        }
        public static String mergeStrings(String one, String two) {
            String lan = "";
            int min = one.length();
            if (two.length() < min) {
                min = two.length();
            }
            for (int i = 0; i < min; i++) {
                lan += one.charAt(i) + "" + two.charAt(i);
                if (two.length() < one.length()) {
                    if (i == two.length() - 1) {
                        lan += one.substring(i+1);
                    }
                } else{
                    if (i == one.length() - 1) {
                        lan += two.substring(i+1);
                    }
                }
            }
            return lan;
        }
        public static ArrayList<Integer> end3(int num){
            ArrayList<Integer> ar= new ArrayList<>();
            for( int i= 0; i<num; i++){
                if(i%10==3){
                    ar.add(i);
                }
            }
            return ar;
        }
        public static String concat(String word,String word2){
//
//    int min = word.length();
//    if (word2.length() < min) {
//        min = word2.length();
//    }
            String n="";
            String n1="";
            for( int i=0; i<word.length();i++){
                if (!word2.contains(word.charAt(i)+"")){
                    n+=word.charAt(i);
                }
            }
            for(int i=0; i<word2.length();i++){
                if (!word.contains(word2.charAt(i)+"")){
                    n1+=word2.charAt(i);
                }
            }
            return n+n1;
        }
        public static ArrayList duplicates(int ... num){
            String n = "";
            ArrayList <Integer> m = new ArrayList<>();
            for (int i = 0; i < num.length;i++){
                if (!n.contains(num[i] + "")){
                    n += num[i] ;
                    for(int j = 0; j < num.length;j++){
                        if (num[i] == num[j] && i != j){
                            m.add(num[i]);
                            break;
                        }
                    }
                }
            }
            return m;
        }
        public static void main(String[] args) {
            System.out.println(sumDigits("123jksa9"));
            System.out.println(mergeStrings("mama","123"));
            System.out.println(end3(25));
            System.out.println(concat("papa","mamak"));
            int number[]= {1,2,34,2,6,6,6,5};
            System.out.println(duplicates(number));
        }
    }



















