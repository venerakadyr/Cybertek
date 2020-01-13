package mockInterview;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PalindromeLongest {
    public static void main(String[] args) {
        String [] arr={"civic","madam","noon","scuiucs", "hjjbsjdh","hhhiut"};
        int longestL=0;
        String longestWord="";
//        String polin="";
//         for(String element:arr){
//             if(element.length()>longestL){
////            longestL=element.length();
//                 longestWord=element;
//
//             }
//
//         }
//        System.out.println(longestWord);

//          for(int i=longestWord.length()-1;i>0;i--){
//              polin+=longestWord.charAt(i)+"";
//          }
//           if(polin.equalsIgnoreCase(longestWord)){
//               System.out.println(polin+" Is  longest Palindrom");
//           }


        ArrayList<String > list=new ArrayList<>();
      list.add("Venera");
        list.add("kk");
        list.add("Vene");
        list.add("Ven");
int largestAr=list.get(0).length();
int index=0;




//        for(String element: arr){
//            String polin="";
//        for(int i=element.length()-1;i>0;i--) {
//            polin += element.charAt(i) + "";
//        }
//            if(polin.equalsIgnoreCase(element)){
//                list.add(element);
//        }
//        }
        System.out.println(list);


        for(int i=0; i<list.size();i++){
            if(list.get(i).length()>largestAr){
                longestWord=list.get(i).length()+"";
                index=i;
//
            }


        }

        System.out.println(longestWord);
 }
}
