
/**
 * Demonstrates the use of the super reference.
 * 
 * @Mr. Chetlen
 * @December 7, 2014
 */

public class Words2
{
   //-----------------------------------------------------------------
   //  Instantiates a derived class and invokes its inherited and
   //  local methods.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Dictionary2 webster = new Dictionary2 (1500, 52500);
      webster.pageMessage();  //Notice how this prints even though pageMessage() is not in Dictionary2
      webster.definitionMessage();
      
           
      System.out.println(webster.toString());   
      
      webster.parentMethod();
      webster.heresASubclassMethod();
      
      Book2 book = new Book2(123);
      book.heresASubclassMethod();
      
      
      
      
      
   }
}