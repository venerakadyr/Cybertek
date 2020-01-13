package stringBuilder;

public class Immune {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("james");
        sb.append("Bond");
        System.out.println(sb);
        sb.append(4+4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);



    }
}
