package enumEx;

public class UsingEnum {
    public static void main(String[] args) {
        Base.LetterGrade grade;
        grade=Base.LetterGrade.A;
        switch(grade){
            case A:
                System.out.println("Your got A");
                break;
            case B:
                System.out.println("Not bad");
                break;
            case C:
                System.out.println("Come on, you can do it better");
                break;
            case D:
                System.out.println("YNot so good");
                break;

            case F:
                System.out.println("Very bad");
                break;


        }
    }
}
