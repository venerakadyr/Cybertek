package utilities;

import java.util.ArrayList;
import java.util.Arrays;

    public class SchoolSystem {

        public static void main(String[] args) {
//        ArrayList<String> k = MyCollection.getStringList();
//
//        System.out.println("\n" + k);
//

            ArrayList<String> list = new ArrayList<>();
            list.add("Json");
            list.add("John");
            list.add("Kanykei");
            list.add("Karina");
            list.add("Adam");
            list.add("Json");
            list.add("Kanykei");
            System.out.println(list + "\n");
            ArrayList<String> k = MyCollection.removeDuplicates(list);
            System.out.println(k);






        }
    }


