package CollectionFrameWork;
import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Venera");
//        names.add("Aika");
//        names.add("Kuri");
//        names.add("Valys");
//
//        Iterator<String> it = names.iterator();
//        System.out.println(it.next());
//      while (it.hasNext()){
//          String name=it.next();
//          System.out.println(name);


        Set<String> first= new HashSet<>();
//        Collection.addAl(first, "red","greeen");
        first.add("red");
        first.add("green");
        first.add("black");
        first.add("white");

        Set<String> second=new HashSet<>();
        second.add("red");
        second.add("yellow");
        second.add("white");
        second.add("pink");
        String color="";
//        Iterator<String> it=first.iterator();
//        Iterator<String> it2=second.iterator();
//
//        while (it.hasNext()&&it2.hasNext()){
//            String f=it.next();
//            String s=it2.next();
//
//            if(f.equalsIgnoreCase(s)){
//                color+=f+" ";
//            }
//        }
         for(String c: first){
             if(second.contains(c)){
                 color+=c+" ";
             }
         }
        System.out.println(color);

      }

    }
