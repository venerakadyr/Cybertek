package testPractice;

public class UniqueNumber {
    public static int uniqueNumber(int[] nums) {
        int num = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
            if (count == 1)
                return num = nums[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int [] nums={1,2,1,2,4,5,4,5,6};
        System.out.println(   uniqueNumber(nums));
    }

}
