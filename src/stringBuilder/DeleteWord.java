package stringBuilder;

import java.util.ArrayList;

public class DeleteWord {


    public static ArrayList insertWord(ArrayList<String> list){

        for(int i=0;i<list.size();i++){
            if(list.get(i).length()%2==0){
                int half=list.get(i).length()/2;
                StringBuilder ss=new StringBuilder(list.get(i));
                  ss.insert(half,"Hello");
                  list.set(i,ss.toString());

            }

        }
        return  list;

    }


    public static String deleteWord(String str) {

        StringBuilder ss = new StringBuilder(str);
//        if(str.toLowerCase().contains("con")){
//        }
        int s = ss.indexOf("con");
        ss.delete(s, s + 3);
        return ss.toString();
    }


    public static String deleteWord(String s1, String s2) {
        StringBuilder ss = new StringBuilder(s1);
//        if(s1.toLowerCase().contains(s2)){
//        }
        int s = ss.indexOf(s2);
        if (s >= 0) {
            ss.delete(s, s + s2.length());

        }
        return ss.toString();

    }







    public static void main(String[] args) {
      ArrayList<String> l=new ArrayList<>();
      l.add("baba");
      l.add("popo");
        System.out.println(insertWord(l));
    }
}