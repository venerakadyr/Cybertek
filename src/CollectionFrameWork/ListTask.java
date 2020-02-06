package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
    public static void main(String[] args) {
        List<String > cars=new ArrayList<>();

        cars.add("BMW");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Lexus");
        System.out.println(cars);
        System.out.println(cars.get(1));
//        [BMW, Toyota, BMW, Lexus]
//          Toyota
    }
}
