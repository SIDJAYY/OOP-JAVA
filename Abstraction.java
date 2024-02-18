abstract class BasicAttacks{
  abstract void attack();
}

class Ling extends BasicAttacks{
  
  void attack(){
    System.out.println("normal damage,Critical damage");
  }
}


public class Abstraction{
  public static void main(String a[]){
    Ling ling  = new Ling();
    ling.attack();
  }
}
//abstract = classes cannot be intantiated, but the can have subclass
//           abstract method are declared without an implementation.
