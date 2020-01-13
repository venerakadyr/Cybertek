package mockInterview;

public class Endswith3 {
    public static void main(String[] args) {
        int[] arr = {1, 33, 4, 5, 13, 3, 13, 333, 12, 13};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 3) {
                System.out.println(arr[i]);
            }
        }
    }
}