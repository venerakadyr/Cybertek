package encapsulation;

import java.util.ArrayList;

public class Application {


//    Create a class App
//This class represents Application on the mobile phone.
//An instance of App should have information about its name, category, rating, description, size, list of reviews.
//Create a constructor for App so that user can create App object only passing name, category, and size.
//Encapsulate all instance variable.
//Create a method open. Method is used to open the App on the phone. It should print “%appName is opening”.
//Create a method close. Same as open method for closing.
//Create a method update. Method should print “%appName is updating”.
//Add static variable numberOfApps. This class member should be increased each time App object gets created.
//Create a method info. Method should print all information about App except for reviews.
//Modify method setReview. Method should accept String message. Method adds review to the list of reviews
// if message is at least 3 letters and prints success message.
// If message less than 3 letters then it should NOT add the review and should print failure message.

        private String name;
        private  String category;
        private double raring;
        private String description;
        private  double size;
        public  static int numberOfApps;
        private ArrayList<String> review;
 public Application(){}


    public Application(String name, String category, int size){
           this.review=new ArrayList<>();
//           initialization of list
            this.name=name;
            this.category=category;
            this.size=size;
            numberOfApps++;
        }

    public ArrayList<String> getReview() {
        return review;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getRaring() {
        return raring;
    }

    public String getDescription() {
        return description;
    }

    public double getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRaring(double raring) {
        this.raring = raring;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSize(double size) {
        this.size = size;
    }





    public void open(){
            System.out.println(name+ " is opening");
        }
        public void close(){
            System.out.println(name+ " is closing");
        }
        public void update(){
            System.out.println(name+ " is update");
        }





        public void info(){
            System.out.println("Name: "+this.name);
            System.out.println("Category: "+ this.category);
            System.out.println("Rating: "+this.raring);
            System.out.println("Description: "+this.description);
            System.out.println("Size: "+this.size);
        }

        public void setReview(String message){

            if(message.length()>=3) {
                review.add(message);
                System.out.println("Success. Your message is added to thr list of review");
            }else{
                System.out.println("Fail. Message is too short");
            }
        }



    }


