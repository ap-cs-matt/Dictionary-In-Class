
/**
 * Represents a book. Used as the parent of a derived class to demonstrate inheritance 
 * and the use of the super reference.
 * 
 * @Mr. Chetlen 
 * @December 7, 2014
 */
public class Book2
{
    public int pages;
 
 public Book2 (int numPages)  
    { pages = numPages;}
     
 //----------------------------------------------------------------
 // Prints a message about the pages of this book.
 //----------------------------------------------------------------
 
 public void pageMessage()
 {
     System.out.println("Number of pages: " + pages);
 }


public String toString()
{
    return "This requires a call to the class Book2";
    
    
}

public void parentMethod()
{
    System.out.println("This is from the super/parent class");
}
}