class Overload{
  int add(int a, int b){
    return a + b;
  }
  int add(int a, int b, int c){
    return a + b + c;
  }
}

public class Polymorphism{
  public static void main(String a[]){
    Overload addMe = new Overload();

    System.out.println(addMe.add(2,3));
    System.out.println(addMe.add(6,2,3));
  }
}
