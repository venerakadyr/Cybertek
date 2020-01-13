package exceptions;

public class Except1 {
    public static void main(String[] args) throws Exception {
        try{
            String s = "hello";
            System.out.println(s.charAt(3));
            System.out.println(3);
            System.out.println(new int []{3,21,1}[5]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
        } catch (ArithmeticException e) {
            System.out.println("Invalid math");
        } catch (Exception e) {
            System.out.println("Unknown exception");
            System.out.println(e.toString());
        }



        }
}
