package arrList;

import classes.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
//    1. Create a class Store.
//Instance variables: name, address,
// list of Item, number of items.
// Create a constructor that accepts name and address and set both values to corresponding instance variables.
//Create a method addItem. This method doesn’t return anything and it accepts Item object as parameter.
// Simply add given Item to the list of items and increment number of items by one.
//Create a method seeInventory. This method doesn’t take or return anything.
// It should simply print each and every single item information. Note: You can use info method that Item class has.
    String name;
    String address;
    int numOfItems;
    ArrayList<Item>items=new ArrayList<>();
    double totalSales;


    public Store(String name, String  address){
        this.name=name;
        this.address=address;
    }



    public void addItem(Item item){

           this.items.add(item);
           numOfItems++;

        }



   public void seeInventory(){
        for(Item item: items){
           item.info();
        }



   }
 public void addItem(){
        Scanner input=new Scanner(System.in);
       System.out.println("How many items would you like to add");
        int quantity=input.nextInt();
        input.nextLine();

        for(int i=0; i<quantity;i++){
            System.out.println("Enter a item's name ");
            String name=input.nextLine();
            System.out.println("Enter a item's price ");
          double price=input.nextDouble();
          input.nextLine();
           Item item1=new Item(name,price);
             items.add(item1);
             numOfItems++;
        }
        seeInventory();
 }

  public void sellItem(String itemName){
         for(int i=0;i<items.size();i++){
             if(items.get(i).name.equals(itemName)){
                 this.totalSales+=items.get(i).price;
                 items.remove(i);
                 System.out.println("Successful trans. Thank you!");
                 return;
             }
         }
      System.out.println("Item is not in stock");
          }

public void returnItem(String itemName){
        Scanner input=new Scanner(System.in);
    System.out.println("Enter a price of the returned item");
    double itemPrice=input.nextDouble();
    Item item=new Item(itemName,itemPrice);
    items.add(item);
    this.totalSales-=itemPrice;
    this.numOfItems++;
    System.out.println("\n Return process successful.");
}
      }






















