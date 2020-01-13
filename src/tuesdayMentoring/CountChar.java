package tuesdayMentoring;

import java.util.HashMap;

public class CountChar {
    public static void main(String[] args) {
//        COUNT THE CAHR IN YOU NAME
//        String s = "abrakadarbra";
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (char ch : s.toCharArray()) {
//            if (!map.containsKey(ch))
//                map.put(ch,1);
//            else
//                map.put(ch,map.get(ch)+1);
//        }
//        System.out.println(map);

//        ====================================================

        int [] arr={1,2,3,4,5,3,2,1,1,2,1,3,4};
        HashMap<Integer,Integer>intArr=new HashMap<>();
        for( int i=0; i<arr.length;i++) {
            if (!intArr.containsKey(arr[i]))
                intArr.put(arr[i], 1);
            else
                intArr.put(arr[i], intArr.get(arr[i]) + 1);
        }
        System.out.println(intArr);
        }


    }

