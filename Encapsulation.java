class Set{
  private String name = "Cardo"; // <- private fields cannot be used in main methods
  public void getName(){// <- creating a public method to call the private fields
    System.out.print("my name is:" + name);
  }
}

public class Encapsulation{
  
  public static void main(String a[]){
    Set user = new Set();
    user.getName();
  }
}

//Encapsulation refers to the bundling of data (attributes) and methods that operate on the data into a single unit
//known as a class.The internal details of the object are hidden from the outside world
//and access to the data is restricted to methods defined within the class.
