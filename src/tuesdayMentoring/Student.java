package tuesdayMentoring;

public class Student {
     String fisrtName;
    String firstName;
    String lastName;
    int age;
    boolean isActive;



    public Student(String firstName, String lastName,int age, boolean isActive){
        this.fisrtName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.isActive=isActive;

    }





    public  String toString( ){

        return this.fisrtName+" | "+this.lastName+ " | "+ this.age+".";
    }
}
