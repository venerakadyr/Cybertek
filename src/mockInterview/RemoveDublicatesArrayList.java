package mockInterview;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDublicatesArrayList {
    public static void main(String[] args) {
//        VERSION ONE

//        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
//        ArrayList<Integer> newVersion = new ArrayList<>();
//
//
//        for (int i = 0; i < newList.size(); i++) {
//            if (!newVersion.contains(newList.get(i))) {
//                newVersion.add(newList.get(i));
//            }
//
//        }
//        System.out.println(newVersion);
//     SECOND VERSION WITH SET
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        // Create a new LinkedHashSet
        Set<Integer> setVersion = new TreeSet<>();

        // Add the elements to set
        setVersion.addAll(newList);

        // Clear the list
        newList.clear();

        // add the elements of set
        // with no duplicates to the list
        newList.addAll(setVersion);
        System.out.println(newList);




    }







        // Function to remove duplicates from an ArrayList
        public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
        {

            // Create a new LinkedHashSet
            Set<T> set = new LinkedHashSet<>();

            // Add the elements to set
            set.addAll(list);

            // Clear the list
            list.clear();

            // add the elements of set
            // with no duplicates to the list
            list.addAll(set);

            // return the list
            return list;
        }





    }

