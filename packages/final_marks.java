/*Create a package CIE which has two classes- Student and Internals. The class Student has members like usn, name, sem. The class Internals has an array that stores the internal marks scored in five courses of the current semester of the student. Create another package SEE which has the class External which is a derived class of Internals. This class has an array that stores the SEE marks scored in five courses of the current semester of the student. Import the two packages in a file that declares the final marks of n students in all five courses.*/


import CIE.*;
import SEE.*;



public class final_marks
{

   public static void main(String args[])
   {
       Student s1 = new Student();
       s1.setData();
       s1.getData();
       
       Internals I1 = new Internals();
       I1.setData();
       I1.getData();
       
       Externals E1 = new Externals();
       E1.setData();
       E1.getData();
   
   }

}
