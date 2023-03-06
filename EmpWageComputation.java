import java.util.*;
public class EmpWageComputation
{
   public static void main(String args[])
   {
      System.out.println("Welcome to Employee Wage Computation Program");
       Random rand = new Random();
       int Attendance= rand.nextInt(2);
       if(Attendance==1)
       {
          System.out.println("Employee is Present");
       }
       else
       {
          System.out.println("Employee is Absent");
       }
   }
}