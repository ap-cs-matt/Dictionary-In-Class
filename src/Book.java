
/**
 * Represents a book. Used a the parent of a derived class to demonstarte inheritance.
 * 
 * @Mr. Chetlen 
 * @December 7, 2014
 */
public class Book
{
    // instance variables - replace the example below with your own
    public int pages = 100;         //protected

    /**
     * Constructor for objects of class Book
     */
    public void pageMessage()
    {
        System.out.println("Number of pages: " + pages);
    }

    
}
