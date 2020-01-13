package constractor;

import org.w3c.dom.ls.LSOutput;

import javax.security.auth.callback.TextOutputCallback;
import java.sql.SQLOutput;

public class Phone {
    boolean touchScreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }


    public Phone(String model, String color, int memory, boolean touchScreen) {
        this.model = model;
        this.color = color;
        this.touchScreen = touchScreen;

        if (memory < 0) {
            System.out.println("Invalid memory");
        } else {
            this.memory = memory;
        }


    }

    public void info() {
        System.out.println("Phone number; "+phoneNumber);
        System.out.println("Model: "+model);
        System.out.println("Memory: "+memory);
        System.out.println("Color: "+color);
        System.out.println("TouchScreen: "+touchScreen);

    }


    public boolean text(long phoneNumber, String text){
        int length = String.valueOf(phoneNumber).length();
//        String number=phoneNumber+""; number.length>10
        if(length>=10&& !text.isEmpty()){
            System.out.println(text+"  is send to "+ phoneNumber);
        }else{
            System.out.println("invalid number or text number");

    }
        return false;
    }

}
