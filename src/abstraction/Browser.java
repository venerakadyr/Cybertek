package abstraction;

public class Browser {
    String name;
    double version;
    double size;




    public void launch(){
        System.out.println("Browser is launching");
    }


    public void browse(String url){
        System.out.println("Browser id browsing  URL:"+ url);
    }

    public void addTab(String url) {
        System.out.println("Browser is adding a table for URL");

    }
}
