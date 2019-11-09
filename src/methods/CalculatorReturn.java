package methods;

public class CalculatorReturn {
//    Create a calculator method that will take three arguments: an operator ( +, -, *, \, %)  and two numbers.
//    Perform that operation between the two numbers and return the result
    public static void main(String[] args) {
        System.out.println(calculator("*",3,4));
    }
    public static double calculator (String op, double one, double two ) {
        switch (op) {
            case "+":
                return one + two;
            case "-":
                return one - two;
            case "*":
                return one * two;
            case "/":
                return one / two;
            case "%":
                return one % two;
            default:
                System.out.println("invalid operator");
                return 0;
        }
    }





}
