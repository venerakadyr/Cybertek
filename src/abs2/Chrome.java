package abs2;

public class Chrome extends Browser implements Bookmark {


    @Override
    public void addUrlBookmark(String url) {
        System.out.println("Given url added to bookmark");

    }

    @Override
    public void removeUrlFromBookmark(String url) {
        System.out.println("Given url remove rom bookmark");

    }

    @Override
    public void launch(){
        System.out.println("Chrome is launching");
    }


    @Override
    public void browse(String url){
        System.out.println("Chrome is beowsing:"+url);
    }

}
