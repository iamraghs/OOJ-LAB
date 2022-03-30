/* Create a package CIE which has two classes- Student and Internals. The class Student has members like usn, name, sem. The class Internals has an array that stores the internal marks scored in five courses of the current semester of the student. Create another package SEE which has the class External which is a derived class of Internals. This class has an array that stores the SEE marks scored in five courses of the current semester of the student. Import the two packages in a file that declares the final marks of n students in all five courses. */




package SEE;

import CIE.*;
import java.util.Scanner;


public class Externals extends Internals
{

    Scanner sp = new Scanner(System.in);
    public void setData()
    {  
        System.out.println("SEE Marks : ");
        System.out.println(" ");
        
        System.out.println("Enter The Number of Subjects ");
        n = sp.nextInt();
        
        marks= new int[n];
        System.out.println("Enter The SEE Marks OF Sub : ");
        for(int i=0; i<n; i++)
        {
        
            System.out.println("Enter SEE marks For Sub :" + (i+1));
            marks[i] = sp.nextInt();
        
        }
        System.out.println(" ");
    }

    public void getData()
    {
        System.out.println("  ");
        System.out.println("The SEE Marks Of Each Sub : ");
        for(int i=0; i<n; i++)
        {
        
            System.out.println("SEE Marks For Sub :" + (i+1) + "   "+ marks[i]);
             
            sum += marks[i];
            
        }
        
        avg = sum/n;
            
            System.out.println("Avg Marks of SEE :" + avg);
            
    
    }



}






