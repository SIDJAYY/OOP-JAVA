abstract class BasicAttacks{ // <- superclass
  abstract void attack();
}

class Ling extends BasicAttacks{ // <- subclass

  @override
  void attack(){ // <- creating the body of attack in superclass
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
