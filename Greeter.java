
package greeter;
import java.util.*;
/** 
 * A class for producing simple greetings.
 */
public class Greeter {
    
    /**
     * The string that stores the name of the Greeter
     */
     private String name;
    
     /**
     * The optimized random method that doesn't create a new Random object with every call
     * @return a random value
     */
     private static final ThreadLocal<Random> RANDOM = new ThreadLocal<Random>() {
       @Override
       public Random initialValue() {
       return new Random();
    }
};

     
/**
 * Constructs a Greeter object that can greet a person or entity.
 * @param aName the name of person or entity who should be 
 * addressed in the greetings.
 */
    public Greeter(String aName) {
        name = aName;
    }
    
    
    
    /**
     * This method returns the greeter object with a random name by picking them
     * out randomly from 2 fixed Greeter object
     * @return a message containing "Hello" and the randomly chosen name of the
    * greeter object.
     */
    public static Greeter getRandomInstance() {
        final Random generator = RANDOM.get();
      if (generator.nextBoolean())
          return new Greeter("Venus");
      else
          return new Greeter("Mars");
    }
    
   /**
    * Greet with a "Hello" message.
    * @return a message containing "Hello" and the name of the
    * greeted person or entity.
    */
    public String sayHello(){
        return "Hello,"+name+"!";
    }

   /**Swaps the name of this greeter and another.
    * @param other the other name to be swapped with
    */
    public void swapNames(Greeter other){
        String change = name;
        name = other.getName();
        other.setName(change);
    }
    
    /** 
     * Sets this Greeter name to the given name
     * @param change the new name for this greeter
     */
    public void setName(String change) {
        this.name = change;
    }

    /**
     * Gets the name of Greeter other
     * @return the name of greeter other
     */
    public String getName() {
        return name;
    }

    
}
 
