/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;
import java.util.*;
/**
 *A class for testing the Greeter class
 */
public class GreeterTester {
    /**
     * Constructs the objects needed to start the program
     * @param args  contains the command-line arguments 
     * passed to the program upon invocation
     */
    public static void main(String[] args){
        /*
         Testing the swapNames methods. 
        Printin the values before the swap and after the swap
        */
        Greeter worldGreeter = new Greeter("World");
        Greeter otherGreeter = new Greeter("Earth");
        String greeting1 = "The old name for worldGreeter: "+worldGreeter.getName();
        String greeting2 = "The old name for otherGreeter: "+otherGreeter.getName();
        System.out.println(greeting1);
        System.out.println(greeting2);
        
        worldGreeter.swapNames(otherGreeter);
        System.out.println("After swapping...");
        
        String greeting3 = "The new name for worldGreeter: "+worldGreeter.getName();
        String greeting4 = "The new name for otherGreeter: "+otherGreeter.getName();
        System.out.println(greeting3);
        System.out.println(greeting4);
               
        /*
         Code to test the new getRandomInstance by saying Hello
        */ 
        Greeter randomGreeter = Greeter.getRandomInstance();
        String randomGreeting = randomGreeter.sayHello();
        System.out.println("\nUsing Random to say Hello- "+randomGreeting);        
        
        /*
        Creating 2 Greeter variables that point to the same Greeter object.
        Then invoking setName and sayHello on them
        */
        Greeter objectOne = new Greeter("ObjectOne");
        Greeter objectTwo = objectOne;
        objectOne.setName("Pluto");
        String stringOne = "\nThe new name set for 'World' is "+objectOne.getName();
        String stringTwo = objectTwo.sayHello();
        
        System.out.println(stringOne);
        System.out.println(stringTwo);
        
        /*
        Asking user their name and creating a greeter object.
        Calling sayHello on that object
        */
        Scanner userName = new Scanner(System.in);
        System.out.println("\nWhat is your name?");
        String testingName = userName.nextLine();
        Greeter objectThree = new Greeter(testingName);
        String userNameTest= objectThree.sayHello();
        System.out.println(userNameTest);
        
        /*
        This will create a varialble and set it to NULL and call sayHello on it.
        */
        Greeter nullGreeter = new Greeter("Something");
        nullGreeter = null;
        System.out.println(nullGreeter.sayHello());
        /*
        A NullPointException is thrown as we are invoking a method on a 
        null reference. The number behind the file name tells us the line
        number on which the excepption is thrown. For this program, it's 73.
        */
    }
    
}
