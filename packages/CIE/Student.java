/* Create a package CIE which has two classes- Student and Internals. The class Student has members like usn, name, sem. The class Internals has an array that stores the internal marks scored in five courses of the current semester of the student. Create another package SEE which has the class External which is a derived class of Internals. This class has an array that stores the SEE marks scored in five courses of the current semester of the student. Import the two packages in a file that declares the final marks of n students in all five courses.*/






package CIE;
import java.util.Scanner;


public class Student
{

   String name,usn;
   int sem;
   Scanner sp = new Scanner(System.in);
   
   
   public void setData()
   {
       System.out.println("Enter The Name :");
       name = sp.nextLine();
       System.out.println("Enter The USN :");
       usn = sp.nextLine();
       System.out.println("Enter The Sem :");
       sem = sp.nextInt();
       
   
   }
   
   public void getData()
   {
   
       System.out.println("Student name : " + name);
       System.out.println("Student USN : " + usn);
       System.out.println("Semister : " + sem);
   
   }
   
   
   

}











