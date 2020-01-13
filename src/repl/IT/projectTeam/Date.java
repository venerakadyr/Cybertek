package repl.IT.projectTeam;

public class Date {
    public static void main(String[] args) {

        int m=10;
        int month=10;
        int d=14;
        int day=15;
        int y=1990;
        int year=2019;
        int age = 0;

        age=year-y;



        if(m==month&&d>day){
           age--;
        }else if(m>month){
            age--;
        }

        System.out.println(age);;
    }


}
