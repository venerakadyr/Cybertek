package variables;

public class castingformula {

    public static void main(String[] args) {

        byte b=45;
        int i=b;
//        short s =i;
//     it is-   compilation error, saying its not compilable. There is a mistake.
//     IntelliJ will detect and will let you know.

        short s=(short)i;

//        if you going to transfer from bigger to smaller primitive, you must explicitly CAST it.








    }







}
