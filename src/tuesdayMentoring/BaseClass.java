package tuesdayMentoring;

import java.util.ArrayList;

public class BaseClass {
    public static void main(String[] args) {


        Student s1=new Student("Aika", "Sh",18,true);
        Student s2=new Student("venera", "k", 18, true);
        Student s3=new Student("kiki", "fhdggdjh",19,false);


        ArrayList<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);


        for( int i=0; i<students.size(); i++)

     if(students.get(i).isActive==true){
      System.out.println(students.get(i).toString());
  }




    }
}
