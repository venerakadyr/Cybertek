package methods;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class Database {
//    public static void main(String[] args) {
//        String dp = "1etsy#2wooden#3spoon";
//        String op = "add"; // edit,remove,none
//        String id = "4";
//        int id1 = Integer.valueOf(id);
//        String data = "aaa";
//        String str = "";
//        String[] dpArray = dp.split("#");
//        System.out.println(Arrays.toString(dpArray));
//        if (op.equalsIgnoreCase("add")) {
//            str=dp+"#"+id+data;
//            System.out.println(str);
//
//               }else if (op=="remove"){
//                   String [] incrementedArray  = new String [dpArray.length-1];
//                   if (id1 > incrementedArray.length ) {
//                        for (int i = 0; i < incrementedArray.length; i++) {
//                            incrementedArray[i] = dpArray[i];
//                       }
//                    }else {
//                       for (int i = 0; i < incrementedArray.length; i++){
//                            if(i==id1){
//                                i++;
//                            }
////                            incrementedArray[i] = dpArray[i];
////                            str = incrementedArray.toString();
////                            System.out.println(str + "remowe");
////                        }
//                    }
//                }else if (op == "edit") {
//                    for(int i = 0; i< dpArray.length; i++) {
//                        if(i==id1){
//                            dpArray [i] ="#" + id1+"" + data;
//                        }
//                        dpArray[i] = dpArray[i];
//                        str = dpArray.toString();
//                        System.out.println(str + "edit");
//                    }
//                }else if (op=="none") {
//                    dpArray = dpArray;
//                    str = dpArray.toString();
//                    System.out.println(str + "none");
//                }
//                System.out.println(str);
//            }
public  boolean isAnagram(String word1, String word2){
    boolean check=true;
    String str11=word1.toLowerCase();
    String str22 =word2.toLowerCase();
    if (str11.length()==str22.length()) {
        char[] arr1 = str11.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str22.toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            check=true;
        }

    }else{
        check=false;
    } return check;
}

    public static void main(String[] args) {

        System.out.println();
    }

}





