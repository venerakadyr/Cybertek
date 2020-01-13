package exceptions;

public class DogThrowEx {

        int age;

        void setAge(int age){
            if(age<0||age>30){
                throw new RuntimeException(age+" Invalid age");

            }
            this.age=age;
        }


        static void bark () throws Exception {
            System.out.println("Dog is barking");
            throw new Exception();
        }

    }


