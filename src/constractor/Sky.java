package constractor;

public class Sky {
    public Sky(String colorCode){
        this.color=colorCode;


    }
    public Sky(String color, int visibleStars){
        this.color=color;
        this.visibleStars= visibleStars;
    }
    String color;
    int visibleStars;


    public void info(){
        System.out.println("\nColor: "+color);
        System.out.println("visible stars: "+this.visibleStars);

    }

    public static void main(String[] args) {
        Sky refSky=new Sky ("Blue");
        Sky s2=new Sky("Yellow", 7);
        s2.info();
        refSky.info();
    }
}
