package classes;

public class Book {
    String title;
    String author;
    int pages;



    public Book(String name, String author, int pages){
        this.title =name;
        this.author=author;
        this.pages=pages;
    }

    public Book(){

    }


    public void info(){
        System.out.println("name "+this.title);
        System.out.println("author "+this.author);
        System.out.println("pages "+this.pages);
    }
}
