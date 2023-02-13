package generics.ex2;

import generics.ex2.library.GenericLibrary;
import generics.ex2.model.Book;

import java.time.LocalDate;


/**
 * Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
 * Provide one version of the class that uses generics and one that does not.
 *
 */

public class Main {
    public static void main(String[] args) {
        GenericLibrary<Book> bookLibrary = new GenericLibrary<>();
        bookLibrary.addMedia(new Book("Abc" ,53.25, LocalDate.now().minusDays(3),"asd"));
        bookLibrary.addMedia(new Book("Bcs" ,55.22, LocalDate.now().minusDays(6),"qwe"));
        bookLibrary.addMedia(new Book("Fgs" ,61.23, LocalDate.now().minusDays(9),"aerwqsd"));

        System.out.println(bookLibrary.getAllMediaWithPriceLowerThan(54));
        System.out.println();
        System.out.println(bookLibrary.getAllMediaWithReleaseDateAfter(LocalDate.now().minusDays(4)));
        System.out.println();
        System.out.println(bookLibrary.getMediaByTitle("Abc"));
        System.out.println();
        System.out.println(bookLibrary.getMediaByTitle("gddgfj"));
        System.out.println();
        System.out.println(bookLibrary.getAllMedia());
    }


}
