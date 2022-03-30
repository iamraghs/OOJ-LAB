/* Create a package CIE which has two classes- Student and Internals. The class Student has members like usn, name, sem. The class Internals has an array that stores the internal marks scored in five courses of the current semester of the student. Create another package SEE which has the class External which is a derived class of Internals. This class has an array that stores the SEE marks scored in five courses of the current semester of the student. Import the two packages in a file that declares the final marks of n students in all five courses. */



package CIE;

import java.util.Scanner;





public class Internals
{
    public int n;
    public int marks[];
    public int sum,avg;
    Scanner sp = new Scanner(System.in);
    
    public void setData()
    {
          System.out.println("   ");
          System.out.println("Enter the Number Of Subjects For CIE :");
          n = sp.nextInt();
          
          marks = new int[n];
          for(int i=0; i < n; i++)
          {
              System.out.println("Enter The Marks Of Sub " + (i+1));
              marks[i] = sp.nextInt();
          
          }
          
    
    
    }
    
    
    public void getData()
    {
    System.out.println("   ");
    System.out.println("CIE Marks of Student :");
    for(int i=0; i<n; i++)
    {
    
    System.out.println("Sub :" + (i+1) + "  "+ marks[i]);
    sum += marks[i];
    
    
    }
    System.out.println(" ");
    avg = sum/n;
    System.out.println("The Average marks of CIE : " + avg);
    System.out.println(" ");
    
    
    
    }
    
    


}





















