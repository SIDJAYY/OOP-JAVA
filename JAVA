public class Main{
  
  int grade = 73; // <- fields /global variable

 
  void sayHi(){ //  <- method signature/ methods
    System.out.print("hi");
  }

  
  public static void main(String a[]){
    Main myObject1 = new Main(); // <- instanciation

    System.out.println("your grade is: "+myObject1.grade); // <- calling the grade of myObject1
    myObject1.sayHi(); // <- calling the sayHi method
  }
}

