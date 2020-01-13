package exceptions;

public class Driver {
//    Task:
//Create a class Driver.
//Add instance variables: name, age, location
//Encapsulate them and provide public getters and setters.

     private String name;
     private int age;
     private String location;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) throws Exception {
        if(name.trim().contains(" ")){
            throw new Exception( name+" Invalid name");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
