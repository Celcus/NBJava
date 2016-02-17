//Currently under development; Unfinished

public class Loops{
  
  //I'm not exactly sure as to why I taught Methods before Loops... oh well :/
  
  public String forLoops(){
    String loopNums = ""; //empty string
    /**
     * how a FOR loop works:
     * 1. Instantiate the loop's variable (it is usually an INT or a DOUBLE)
     * 2. Check to see if the statement is True
     * 3. Increment/Decrement that loop variable by X amount
     * 4. Perform the code statements within the loop
     * 5. re-check step 2, if True, do step 3, then perform code within the loop
     */
     
     //Lets make our first FOR loop:
     for(int i = 0; i < 5; i++){
       //we made an int called "i" and set it equal to zero (0)
       //we check to see if 0 < 5 is true, it is; lets move on
       //i++ means i+1
       loopNums += i; //we print the current value of "i"
       
       //next, it reloops again, but this time, i = 1
       //it will keep going until i is no longer greater than 5
       //then the loop will end
      }return loopNums;
    }
    
    public String whileLoops(){
      
    }
    
    public String doWhiles(){
      
    }
  
  //Make a main method; Hopefully from E4, 
  //you understand how/why this method is written
  public static void main(String [] args){
    
  }
}
