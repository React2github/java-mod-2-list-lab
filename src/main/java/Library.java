import java.util.ArrayList;

public class Library  {
    ArrayList<String> List = new ArrayList<String>(); {
    
    for (String myString: List) {
        List.add(Book.Title);
        List.add(Book.Genre);
        List.add(Book.numberOfPages);

        System.out.println(myString);
    }
    
    }

}
