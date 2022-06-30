import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Check for new book 
            
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Do you want to add a book? ");
            String addBook = obj.nextLine();

        // Loop to add a new book 

            while (addBook.equalsIgnoreCase("Yes")) {
            System.out.print("Enter a book name: ");
            Library Collection = new Library();
            Book.Title = obj.nextLine();
            Collection.List.add(Book.Title);
            System.out.println(Book.Title);
            System.out.print("Enter a Genre: ");
            Book.Genre = obj.nextLine();
            Collection.List.add(Book.Genre);
            System.out.println(Book.Genre);
            System.out.print("How many pages? ");
            Book.numberOfPages = obj.nextLine();
            Collection.List.add(Book.numberOfPages);
            System.out.println(Book.numberOfPages);

        // Returns list of books 
        
            System.out.println(Collection.List);
            System.out.println("Do you want to add a book? ");
            addBook = obj.nextLine();
            }
            


            
        } 
    }
}
