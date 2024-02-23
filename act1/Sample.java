public class Sample{
    public static void main (String[]args){
     System.out.println("Hi!");
     Student std1 = new Student();
     std1.stdName="Joshua";
     System.out.println(std1.stdName);
     std1.myMethod();


    Student std2 = new Student();
    std2.stdName="Ana";
    System.out.println(std2.stdName);

    Student.myMethod2();

    System.out.println("The sum of two numbers is:" + Student.methodSum(5,10));

  }
}