package classes;

public class Facebook {
    String username;
    String password;
    String name;
    int age;
    int numOfFriend;


 public Facebook(String username, String password){
     if(password.contains(username)){
         System.out.println(password+ " contains "+ username+". Default password created");
         this.password="password";
     }
     this.password=password;
     this.username=username;
 }




    public Facebook(String userName, String password, String name) {
        this(userName,password);

        name = name.replace(" ","");

        boolean valid = true;

        for(int i=0; i < name.length(); i++) {
            if(!Character.isLetter(name.charAt(i)))  {
                valid = false;
                break;
            }
        }

        if(valid) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
            this.name = "no name";
        }

    }




    public Facebook( String username, String password, String name,int age,int numOfFriend ){
     this(password,username,name);
     if(numOfFriend>0 ||  age>0 ){
         this.numOfFriend=numOfFriend;
         this.age=age;
        }else{
         System.out.println("Invalid");
         this.numOfFriend=0;
         this.age=0;
        }


    }

public void info(){
    System.out.println(username);
    System.out.println(password);
    System.out.println(name);
    System.out.println(age);
    System.out.println(numOfFriend);
}



}
