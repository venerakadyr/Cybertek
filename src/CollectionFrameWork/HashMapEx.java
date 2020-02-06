package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> gradeScale=new HashMap();

        //put() method to add to HashMap
        gradeScale.put("A",90);
        gradeScale.put("B",80);
        gradeScale.put("C",70);
        gradeScale.put("D",60);
        gradeScale.put("F",50);

        // remove() method to remove
//        gradeScale.remove("f");
//
//        // get() method to get each value
//        System.out.println(gradeScale.get("B"));
//        System.out.println(gradeScale.get("C"));
//        System.out.println(gradeScale.get("H"));
//        /* 80 70 null */
//        System.out.println(gradeScale);
//
//        System.out.println(gradeScale.containsKey("A"));
//        System.out.println(gradeScale.containsKey("Z"));
//// reassigning of value
//        gradeScale.put("C",10);

        System.out.println(gradeScale);

//        Set<String> keys=gradeScale.keySet();
//
//        System.out.println(keys);
//
//        for(String key: gradeScale.keySet()){
////            System.out.println(key);
//
////            System.out.println(gradeScale.get(key));
//
//            if(key.equalsIgnoreCase("C"))gradeScale.put(key,88);
//            System.out.println(key+" "+gradeScale.get(key));

            }
        }









