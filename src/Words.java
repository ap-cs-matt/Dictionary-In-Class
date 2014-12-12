
/**
 * Demonstrates the use of an inherited method.
 * 
 * @Mr. Chetlen
 * @December 7, 2014
 */

public class Words
{
    
 //-----------------------------------------------------------------
 // Instantiates a derived class and invokes its inherited and
 // local methods.
 //-----------------------------------------------------------------
 
 public static void main (String[] args)
 {
  //construct a new Dictionary object called webster
 Dictionary webster = new Dictionary();
 webster.pageMessage();
 webster.definitionMessage(); 
}


}