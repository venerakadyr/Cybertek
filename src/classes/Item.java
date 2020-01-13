package classes;

public class Item {
    public String name;
   public  double price;
   public  int size;
    public Item(String name, double price){
        this.name=name;
        this.price=price;

    }

    // Overload the constructor that takes 3 parameters to set all 3 instance variables

    public Item(String name, double price, int size){
        this.name=name;
        this.price=price;
        this.size=size;
    }
  //We can call constructor inside another constructor.
  //It is called constructor chaining;
  //We can do it using keyword "this" with parenthesis
//    this(name,price);



    public void info(){
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price );

    }





}
