package classes;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
//        Book book1 = new Book("java", "cybertek", 500);
//        Book book2 = new Book("string", "cybertek", 800);
//        Book book3 = new Book("int", "cybertek", 600);
//        Book[] myBooks = new Book[3];
//        myBooks[0] = book1;
//        myBooks[1] = book2;
//        myBooks[2] = book3;
//
//        myBooks[0].pages = 50;

// FIRST TYPE OF LOOPING
//        for(Book eachBook: myBooks){
//            System.out.println(eachBook.name);
//            System.out.println(eachBook.name+" has "+eachBook.pages+ " pages");

        // SECOND TYPE OF LOOPING
//        for (Book eachBook : myBooks) {
//            eachBook.info();
//
//            // THIRD TYPE OF LOOPING
//
//            for (int i = 0, j = 50; i < myBooks.length; i++, j += 100) {
//                myBooks[i].pages = j;
//                System.out.println(myBooks[i].pages);
//            }
//
//
//        }
//================================================================================
//        for (Book eachBook: myBooks) {
//            eachBook.info();
//            //  System.out.println(eachBook.name +  " has " +eachBook.pages + " pages");
//        }
//        for(int i=0, j = 50; i < myBooks.length;i++, j += 100) {
//            myBooks[i].pages = j;
//        }
//        for (Book eachBook: myBooks) {
//            eachBook.info();
//            //  System.out.println(eachBook.name +  " has " +eachBook.pages + " pages");
//        }================================================================================================
//
//Create a program that will ask the user how many books they have. Then they will be asked to enter the book’s title, author, and number of pages. Create each book object and store them into a Book array.
//Part 2: Loop through your array and print the name of all the books

//        FIRST OPTION
//     Scanner input=new Scanner(System.in);
//        System.out.println("How many books ");
//       int userBook=input.nextInt();
//       input.nextLine();
//       Book [] library= new Book[userBook];
//        for(int i=0;i<library.length;i++){
//            System.out.println("Enter a books title "+(i+1));
//            String title=input.nextLine();
//
//            System.out.println("Enter Author " +(i+1));
//            String author=input.nextLine();
//
//            System.out.println("Enter a pages "+(i+1));
//            int pages=input.nextInt();
//            input.nextLine();
//
////            Book eachBook=new Book(title,author,pages);
////            library[i]=eachBook;
//            library[i]=new Book(title,author,pages);
//
//
//        }
//
//    for(Book book: library){
//        System.out.println(book.title);
//    }====================================================================================================
//        FIRST OPTION
        Scanner in = new Scanner(System.in);
        System.out.print("how many are the books? ");
        int numOfbook = in.nextInt();
        in.nextLine();
        Book [] allBooks = new Book[numOfbook];
        for( int i = 0 ; i< allBooks.length ; i++){
            System.out.println("please enter the title , author and the pages of book no "+(i+1));
            allBooks[i] = new Book(in.nextLine(),in.nextLine(),in.nextInt());
            in.nextLine();
        }
        for( Book book : allBooks){
            book.info();
        }



    }


}

