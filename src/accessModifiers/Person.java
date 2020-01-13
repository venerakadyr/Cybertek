package accessModifiers;

public class Person {
//    Create a class Person. 
//create instance variables for Person as below:  name, gender, age, height, weight 
//2. Encapsulate all instance variables. 
//Modify setter methods for gender, age, height and weight. 
//Set age only with valid age. Valid age must be between 0 to 120. If invalid age print “invalid age” and don’t set. 
private  String name;
private char gender;
private int age;
private int height;
private int weight;

      public Person(){

      }

     public Person(String name,char gender, int age, int height, int weight){
      this.name=name;
      this.gender=gender;
      this.age=age;
      this.height=height;
      this.weight=weight;
     }

     public void setAge( int age){
         if(age>0&&age<120){
             this.age=age;
         }else{
             System.out.println("Invalid age");
         }

     }

     public void setGender(char gender){
         if(gender=='M'||gender=='F') {
             this.gender = gender;
         }else{
             System.out.println("invalid gender. Use uppercase and single letter only");
         }
     }


    public void setWeight(int weight) {
         if(weight>0) {
             this.weight = weight;
         }else{
             System.out.println("Invalid weight");
         }
    }



    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }else{
            System.out.println("Invalid height");
        }
    }


    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
