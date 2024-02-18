class A{ // <- superclass
  public void getA(){
    System.out.print("A");
  }
}
class B extends A{ // <- subclass
  public void getB(){
    System.out.print("B");
  }
}
class C extends A{
  public void getC(){
    System.out.print("C");
  }
}
class D extends C{
 public void getD(){
    System.out.print("D");
  }
}

public class Main{
  public static void main(String a[]){
    B b = new B();
    D d = new D();
    b.getA();
    d.getC();
  }
}

//Inheritance = allows a class (subclass or derived class) to inherit the properties and behaviors of another class (superclass or base class).
//              a class can only inherit from one superclass, but it allows for the creation of hierarchical relationships between classes.




