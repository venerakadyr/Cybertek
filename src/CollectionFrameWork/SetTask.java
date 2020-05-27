package CollectionFrameWork;

import java.util.*;

public class SetTask {
    public static void main(String[] args) {
//   Set<String > cars=new HashSet<>();
//
//        cars.add("BMW");
//        cars.add("Toyota");
//        cars.add("BMW");
//        cars.add("Lexus");
//        System.out.println(cars);
//        [Lexus, Toyota, BMW]


        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        Set<Integer> num= new HashSet<>();
        for(int i=0;i<=4;i++){
            int n=input.nextInt();
            num.add(n);
        }
        System.out.println(num);
        Iterator<Integer> it=num.iterator();
        while(it.hasNext()){
            int temp=it.next();
            if(temp%2==1){
                it.remove();
            }
        }



        System.out.println(num);

    }
}
