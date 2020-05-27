package mockInterview;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class PrintSinglePairOFDublicates {
    String name;




        public static void main(String[] args) {
            int[] num={1,2,3,5,1,2,3};
            printDistinctElements(num);

//            int nonDuplicate=0;
//        for(int i=0; i<num.length;i++){
//             boolean isUnique=false;
//            nonDuplicate=num[i];
//            for(int j=0; j<i;j++){
//                if(num[i]==num[j]){
//                    isUnique=true;
//                    break;
//                }
//
//                }
//            if(!isUnique){
//
//                System.out.println(nonDuplicate);
//            }
        }
















//            Integer[] objectArray = new Integer[num.length];

//            for(int i = 0; i < num.length; i++) {
//                objectArray[i] = Integer.valueOf(num[i]); // returns Integer value
//            }
//
//
//            List<Integer> newObject=new ArrayList<>(Arrays.asList(objectArray));
//            Set<Integer> uniqKeys = new TreeSet<Integer>();
//            uniqKeys.addAll((newObject));
//            System.out.println("uniqKeys: " + uniqKeys);


//            Scanner input = new Scanner(System.in);
//            int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//
//            int singleNum=0;
//            Arrays.sort(nums);
//            for(int i=0; i<nums.length;i++){
//                if(i==nums.length-1&& nums[nums.length-1]!=nums[nums.length-2]){
//                    singleNum=nums[nums.length-1];
//
//                }else if(i==0&& nums[0]!=nums[1]){
//                    singleNum=nums[0];
//
//                }else if(i>0&&i<nums.length-1){
//                    if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]){
//                        singleNum=nums[i];
//                    }
//                }
//            }
//            System.out.println(singleNum);

//
//            int[] nums = {5,2,7,2,4,7,8,2,3};
//          printDistinctElements(nums);
//     }




    public static void printDistinctElements(int[] arr){

        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }


public static void uniqeWithCollections(int [] num){
            int count=0;
    // turning int array to Integer Object
    Integer[] objectArray = new Integer[num.length];
      // looping through and putting array
    for(int i = 0; i < num.length; i++) {
        objectArray[i] = Integer.valueOf(num[i]); // returns Integer value
    }
     //Turning Array to List

    List<Integer> newListInteger=new ArrayList<>(Arrays.asList(objectArray));
    //List for duplicate
  Set<Integer> singlePair=new TreeSet<>();
  singlePair.addAll(newListInteger);

}

    }


