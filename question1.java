import java.util.*;

class question1{
     String name;
     int roll_number;
     String branch;
     char section;
     String university;
     double cgpa;
     double sgpa;

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
    question1 obj = new question1();
    obj.getdata();
    obj.display();
}
}