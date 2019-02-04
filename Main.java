import java.util.*;
import java.io.*;

public class Main{
  
  public static void main(String[] args)
  {
    // the stack maiontains method invokations.
    //Once the internal method is complete, that pops off the stack, then the next thing(outside of it, or below it will execute)
  int age; //decloration that makes memory alloacation with the var name "age"
    age = 12;  //telling memory value
    age = 15; // now age var refers to value of 15
    
    doSomething(); // added to the stack Stacks are LIFO: Last in , first out.
    
    String name = " ";
    
    Apple anApple;// Setting a local ref varible in main that has a slot in the main section of the stack that has memory allocated for it! This var POINTS to it]
    // anApple does not have the actual data! It just has the address! The new Apple part actuallly has the data in a address in memory. That's when the object is created in the heap
    // anApple POINTS to the Apple object with the data in the heap.Primitave datatypes, the variable actually contaions the data! In the case of the objects, they contai nthe address, not the data
    
    anApple = new Apple("Macintosh", "Orange"); // now the  
    System.out.println(anApple);
    anApple = new Apple(); // Now  I am setting the same variable to point to a new different apple! I am changing the address
    System.out.println(anApple);

    // This is where garbage collection comes in, we lost the original apple that was initalized with the var anApple and values "Macintosh" and red.
    // Now that we changed where anApple points, the old one will be collected by the garbage collection so that we can save memory, since we showed java that we dont want it anymore.
    
    
    
    
    //Instance valiables: Belonges to an instance!
    
    // In this case, the instance vars for an apple are its data members, such as name and color
  
    //This method has its own frame to have variable reservations in memory.

    
  }
    public static void doSomething()
  {
    float weight = 120;
    doAnotherThing(5);// this new method will be added to the overall stack too
  }
  
  
  public static int doAnotherThing(int a){
    return a + 1;
  }
}

  

