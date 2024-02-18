class Overloading{
  int add(int a, int b){
    return a + b;
  }
  int add(int a, int b, int c){
    return a + b + c; 
  }
}

public class Polymorphism{
  public static void main(String a[]){
    Overloading addMe = new Overloading();

    System.out.println(addMe.add(2,3));
    System.out.println(addMe.add(6,2,3));
  }
}

//method overloading allows a class to have multiple methods with the same name but different parameter lists.
//This can improve code readability and maintainability. 
//Method overloading is based on the number or types of parameters in the method signature.
