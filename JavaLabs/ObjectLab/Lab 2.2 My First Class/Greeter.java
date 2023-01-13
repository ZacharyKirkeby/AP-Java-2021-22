public class Greeter{/* Write the Greeter class in this file.

 * This class should have 2 methods in it.
 * 
 * sayHi method
 * Returns nothing
 * Takes no paramters
 * Outputs the message "Hello" using System.out.println
 * Note: this method is one of the few methods that should use System.out.println
 * 
 * greet method
 * Returns nothing
 * Takes a String parameter called name
 * Outputs the message "Hello [NAME]" where [NAME] is the value of the name parameter
 * Note: this method is one of the few methods that should use System.out.println
 */
public void sayHi(){
  System.out.println("Hello");
}
public void greet(String s){
  System.out.println("Hello " + s);
}


}