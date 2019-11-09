package string;

public class MiddleTwo {


    public static void main(String[] args) {





//        formula  variable/2 always gives us the middle letter
//        variable=str.length/2;
//        str.substring(middle-1)==========comes to middle and take "o" +(middle+1)====="r"// COMES TO MIDDLE -1 LETTER BACK
//        "O" AND SECOND COMES TO MIDDLE +1 LETTER "R"
        String str="word";
        int middle=str.length()/2;
        System.out.println(str.substring(middle-1, middle+1) )  ;



    }
}
