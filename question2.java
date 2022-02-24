import java.util.*;
public class question2
{
  String name;
  int id;
  String comp;
  double salary;
  void getdata()
  {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the name : ");
     name = in.nextLine();
     System.out.println("Enter the Employee ID : ");
     id = in.nextInt();
     System.out.println("Enter the name of company name : ");
     comp = in.next();
     System.out.println("Enter the salary : ");
     salary = in.nextDouble();
   }
  void display()
  {
      System.out.println("Employee details.");
      System.out.println("Name : " + name);
      System.out.println("Employee id : " + id);
      System.out.println("Company Name : " + comp);
      System.out.println("Salary: " + salary);
       }
  public static void main (String[] args)
  {
      question2 obj = new question2();
      obj.getdata();
      obj.display();     
  }
}