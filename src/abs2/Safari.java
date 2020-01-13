package abs2;

public class Safari extends Browser {
    @Override
    public  void launch(){
        System.out.println("Safari is launchinh");
    }




    @Override
    public  void browse(String url){
        System.out.println("Safari is browsing: "+url);
    }

}
