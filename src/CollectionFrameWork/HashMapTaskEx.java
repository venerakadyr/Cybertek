package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTaskEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);
        map.put("Forth", 4);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");

        int number = input.nextInt();
        input.nextLine();

    if(!map.containsValue(number)){
     System.out.println("invalid number "+number);
 }
        for (String key : map.keySet()) {

            if (map.get(key) == number) {
                System.out.println(key);



            }
        }
    }
}