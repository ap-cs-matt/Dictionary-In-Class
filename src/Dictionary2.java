
/**
 * Represents a dictionary which is a book.  Used to demonstrate the use of the super reference.
 * 
 * @Mr. Chetlen
 * @December 7, 2014
 */
public class Dictionary2  //Dictionary2 is a subclass of Book2 so add code here
{
 private int definitions;
 //-----------------------------------------------------------------
 // Sets up the dictionary with the specified number of pages (maintained by the Book parent class) 
 // and definitions
 //-----------------------------------------------------------------
 
 public Dictionary2(int numPages, int numDefinitions)
 {
     super(numPages);    // or pages = numPages; This passes numPages to the super constructor, in this case it's not necessary.
     definitions = numDefinitions;
 }
 
 //-----------------------------------------------------------------
 // Prints a message using both local and inherited values.
 //-----------------------------------------------------------------
public void definitionMessage()
 {
     System.out.println("Number of definitions: " + definitions);
     System.out.println("Definitions per page: " + definitions/pages);
 }
 
public String toString()
{
        
    return  /*add a call to the super class + */ "  . . . and this is from the subclass class Dictionary2";
}

public void heresASubclassMethod() 
{
    
    System.out.println("This method is only in the subclass");    
}


}
