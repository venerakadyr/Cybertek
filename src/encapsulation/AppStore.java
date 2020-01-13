package encapsulation;

public class AppStore {
    public static void main(String[] args) {
        Application whatsApp=new Application("whatsapp","Social network", 9);
        whatsApp.info();
        whatsApp.update();
        whatsApp.setSize(3.4);
        whatsApp.setReview("Coolest app");
        System.out.println(whatsApp.getReview());
    }
}
