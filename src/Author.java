import java.util.List;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     * Create a custom constructor that will take 6 args and defines the Author object
     * Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */


    //Create 6 args custom constructor here
    //YOUR CODE HERE
    public Author(String firstName, String lastName, String country, boolean isAlive, int age, List<Book> books) {


    }


    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public List<Book> books;


    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                ", books=" + books +
                '}';
    }
}