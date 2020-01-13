package udemyCoding;

import inheritance.Animal;

public class Animal$ {
  public  String name;
  public int age;
  public int size;
    String body;


    public Animal$(){

}

    public Animal$(String name, int age, String body, int size) {
        this.name = name;
        this.age = age;
        this.body = body;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getBody() {
        return this.body;
    }

    public int getSize() {
        return this.size;
    }


}
