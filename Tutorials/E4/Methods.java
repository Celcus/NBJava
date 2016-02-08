//In this tutorial, we'll be learning about Methods in Java

//Lets start by creating a Class for our code
public class e4{
  
  //Lets create that method
  public String containsHello(String h){
    //We have learned about if/else statements in
    //the E3 tutorial
    if(h.contains("hello")){
      return "This sentence contains 'hello'";
    }else{
      return "This sentence does not contain 'hello'";
    }
  }
  
  //Now lets create that main method
  public static void main(String[] args){
    String sentence = "Hello from the other side";
    System.out.println(containsHello(sentence));
  }
  
}
