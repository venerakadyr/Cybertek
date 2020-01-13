package constractor;

public class Person {

        String firstName;
        String lastName;
        int age;

        public Person(){
            this.firstName="undefined";
            this.lastName="undefined";
            this.age=-1;


        }

        public Person(String firstName, String lastName, int age){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
        }

        public String toString(){
            return this.firstName+"|"+  this.lastName+"|"+ this.age;

        }



        public String getFirstName(){
            return this.firstName;
        }
        public String getLastName(){
           return this.lastName;

        }
        public int getAge(){
            return this.age;
        }


    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    }


