package mockInterview;
import java.util.*;
import java.util.Arrays;

public class FindNonDublicate {
    String name;




        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            int singleNum=0;
            Arrays.sort(nums);
            for(int i=0; i<nums.length;i++){
                if(i==nums.length-1&& nums[nums.length-1]!=nums[nums.length-2]){
                    singleNum=nums[nums.length-1];

                }else if(i==0&& nums[0]!=nums[1]){
                    singleNum=nums[0];

                }else if(i>0&&i<nums.length-1){
                    if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]){
                        singleNum=nums[i];
                    }
                }
            }
            System.out.println(singleNum);
        }
    }

