import java.util.*;

class question3{
     String name;
     int roll_number;
     String branch;
     char section;
     String university;
     double cgpa;
     double sgpa;
     int m1,m2,m3,m4,m5,tot,avg;

public void getdata(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter student's name : ");
    name = in.nextLine();
    System.out.println("Enter roll number : ");
    roll_number = in.nextInt();
    System.out.println("Enter student's branch : ");
    branch = in.next();
    System.out.println("Enter student's section : ");
    section = in.next().charAt(0);
    System.out.println("Enter student's University : ");
    university = in.next();
    System.out.println("Enter student's CGPA : ");
    cgpa = in.nextDouble();
    System.out.println("Enter student's SGPA :'");
    sgpa = in.nextDouble();
}

void total()
  {
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter the marks in Subject 1 : ");
     m1 = sc.nextInt();
     System.out.println("Enter the marks in Subject 2 : ");
     m2 = sc.nextInt();
     System.out.println("Enter the marks in Subject 3 : ");
     m3 = sc.nextInt();
     System.out.println("Enter the marks in Subject 4 : ");
     m4 = sc.nextInt();
     System.out.println("Enter the marks in Subject 5 : ");
     m5 = sc.nextInt();
     int total = m1 + m2 + m3 + m4 + m5;
     tot = total;
     System.out.println("Total : " + total);   
  }
  void average()
  {
      System.out.println("Average : " + tot/5);
  }
 
public void display(){
    System.out.println("Name :" + name);
    System.out.println("Roll Number :" + roll_number);
    System.out.println("Branch : " + branch);
    System.out.println("Section : " + section);
    System.out.println("University : " + university);
    System.out.println("CGPA : " + cgpa);
    System.out.println("SGPA : " + sgpa);
}

public static void main(String[] args){
    question3 obj = new question3();
    obj.getdata();
    obj.display();
    obj.total();
    obj.average();
}
}