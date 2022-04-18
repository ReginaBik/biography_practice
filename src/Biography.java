import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        ArrayList<Author> author = new ArrayList<>();

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */
        //  int noBookInfo = 0;


        System.out.println(Questions.favoriteAuthorFirstName);
        String name = scan.next();

        System.out.println(Questions.favoriteAuthorLastName);
        String lastName = scan.next();
        scan.nextLine();

        System.out.println(Questions.authorCountry);
        String country = scan.nextLine();


        System.out.println(Questions.authorIsAlive);
        boolean alive = scan.next().toLowerCase().startsWith("y");

        int age = 0;
        if (alive) {
            System.out.println(Questions.authorHowOld);
            age = scan.nextInt();
        }

        String bookInformation;
        do {
            System.out.println(Questions.bookInformation);
            bookInformation = scan.next();
            if (bookInformation.toUpperCase().startsWith("N")) break;
            else if (bookInformation.toUpperCase().startsWith("Y")) {
                System.out.println(Questions.bookName);
                String bookName = scan.nextLine();
                scan.nextLine();

                System.out.println(Questions.bookGenre);
                String bookGenre = scan.nextLine();

                System.out.println(Questions.bookPage);
                int bookPage = scan.nextInt();

                Book book = new Book(bookName, bookGenre, bookPage);
                books.add(book);
            }

        } while (bookInformation.toUpperCase().startsWith("Y"));

        Author authorInfo = new Author(name, lastName, country, alive, age, books);

        System.out.println(authorInfo);

        for (Book book : authorInfo.books) {
            System.out.println(book);
        }

    }


}

