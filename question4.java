import java.util.*;
public class question4
{
  String name;
  int id;
  String comp;
  double salary;
  double hra, da, ta, gross;
  void getdata()
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the name : ");
     name = sc.nextLine();
     System.out.println("Enter the Employee ID : ");
     id = sc.nextInt();
     System.out.println("Enter the name of company name : ");
     comp = sc.next();
     System.out.println("Enter the salary : ");
     salary = sc.nextDouble();
   }
  void display()
  {
      System.out.println("Employee details.");
      System.out.println("Name : " + name);
      System.out.println("Employee id : " + id);
      System.out.println("Company Name : " + comp);
      System.out.println("Salary: " + salary);
       }
  void disp()
  {
      hra = 0.1 * salary;
      da = 0.9 * salary;
      ta = 0.03 * salary;
      gross = salary + hra + da + ta;
      System.out.println("HRA : " + hra);
      System.out.println("DA : " + da);
      System.out.println("TA : " + ta);
      System.out.println("Gross : " + gross);
      
  }
  public static void main (String[] args)
  {
      question4 obj = new question4();
      obj.getdata();
      obj.display();     
      obj.disp();
  }
}