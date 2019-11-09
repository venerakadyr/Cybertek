package string;

public class TenTask {
    public static void main(String[] args) {


//        Task10
// User will be given a string:
//“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
//> You will separate these parts and print them separately. > Print the following:
//“Sender: actualSender”
//“Number: actualNumber”
//“Message: actualMessage”


          String info="Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";
        int senderStart=info.indexOf("<")+1;
//       +1 means print is gonna start with James not "<"
        int senderEnd=info.indexOf(">");

        int numberStart=info.indexOf("[")+1;
        int numberEnd=info.indexOf("]");

        int messageStar=info.indexOf("{") +1;
        int messageEnd=info.indexOf("}");
        String sender=info.substring(senderStart,senderEnd);
        String number=info.substring(numberStart,numberEnd);
        String message=info.substring(messageStar,messageEnd);



        System.out.println("Sendre:"+ sender);
        System.out.println("Number:"+number);
        System.out.println("Message:"+message);

//       /n new line on print out

    }
}
