package mockInterview;

import java.util.Arrays;

public class AnagramTask {
    public boolean isAnagrame() {
        String word1 = "listen";
        String word2 = "silent";
        int anagram = 0;
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        for (int i = 0; i < word1.length(); i++) {
            int count = 0;
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    count++;
                }
            }
            if (count > 0) {
                anagram++;
            }
        }
        if (anagram == word1.length()) {
            return true;
        }
        return false;
    }

    //       boolean check=true;
//              //     String str1=word1.toLowerCase();
//              //     String str2 =word2.toLowerCase();
//              //     if (str1.length()==str2.length()) {
//              //         char[] arr1 = str1.toCharArray();
//              //         Arrays.sort(arr1);
//              //         char[] arr2 = str2.toCharArray();
//              //         Arrays.sort(arr2);
//              //         if(Arrays.equals(arr1, arr2)){
//              //             check=true;
//              //         }
//
//              //     }else{
//              //         check=false;
//              //     }
//              //     return check;
//              // }
    public static boolean isAnagram(String str1, String str2) {
        //1- Check if both strings have same length
        if (str1.length() != str2.length()) {
            return false;
        }
        //2- Create two char array, and store the strings as char arrays
        char[] str1arr = str1.toCharArray(); // march --> m,a,r,c,h
        char[] str2arr = str2.toCharArray(); // charm --> c,h,a,r,m
        //3- sort these arrays
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);
        //4- check if the two char arrays equals, and return value
        return Arrays.equals(str1arr, str2arr);

    }

    public static void main(String[] args) {
        int[] arr2 = {1, 3, 4, 6, 7, 5};
        int temp1 = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr2[j] > arr2[j + 1]) { // b, a, c
                    temp1 = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp1;
                }

            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
