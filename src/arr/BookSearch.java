package arr;

import java.util.Arrays;
import java.util.Scanner;

public class BookSearch {
    public static void main(String[] args) {

//Given you have a library of 5 books. Write a program that will ask user to enter the name of one of the books.
// If the book is in the library, ask the user what book they replace the original book with.
// If the book the user enters is not in the library, print “library not changed”.
// In both cases print out the library for the user to see.

        String [] books={"Leaders eat Last", "Harry Potter","Mindset","OCA","Eragon"};
        Arrays.sort(books);

        Scanner input=new Scanner(System.in);
        System.out.println(Arrays.toString(books));
//        in order user will see what book we have
        System.out.println("what book you want to replace?");
        String name=input.nextLine();
        int index=Arrays.binarySearch(books,name);
         if( index>0){
//             index>0 because if book is  not in the arrays so it gives -#, it less then 0
             System.out.println("What book will you replace "+name+ "with?");
             String newBook=input.nextLine();
             books[index]=newBook;
         }else{
             System.out.println("Book not found");
         }

        System.out.println(Arrays.toString(books));





    }
}
