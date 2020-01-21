package mockInterview;

import java.util.ArrayList;

public class RemoveDublicate {
    public static void main(String[] args) {
        int [] arr={4,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(i==0){
                System.out.println(arr[i]+1);
            }

        }
    }


        public static int [] removeDuplicate(int ... arr) {
            ArrayList<Integer> unique = new ArrayList<>();
            for(int i=0; i < arr.length; i++) {
                if(!unique.contains(arr[i])) {
                    unique.add(arr[i]);
                }
            }
            return convertArray(unique.toArray());
        }
        private static int [] convertArray(Object [] arr) {
            int [] nums = new int[arr.length];
            for(int i=0; i < arr.length; i++) {
                nums[i] = (int) arr[i];
            }
            return nums;
        }
    }

