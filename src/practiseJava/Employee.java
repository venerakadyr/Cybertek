package practiseJava;


    public class Employee extends Person
    {
        String name;
        int age;

        public  Employee(){

        }

        public Employee(String name)
        {
            this.name=name;

            System.out.println("Employee class constructor called");
        }


        public Employee(String name,String address)
        {
            this(name);
//            super(address);
//            this.age=age;

            System.out.println("Employee class constructor called");
        }



        public static void main (String args[])
        {
            Employee e = new Employee();
        }
    }

