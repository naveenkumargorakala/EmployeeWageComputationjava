import java.util.*;
import java.util.Random;
public class EmpWageComputation
{
   public static void main(String args[])
   {
      int DailyWage,WagePhr=20,empHrs;
      System.out.println("Welcome to Employee Wage Computation Program");
      Random rand = new Random();
      int Attendance= rand.nextInt(3);
      if(Attendance==1)
      {
         empHrs=8;
         System.out.println("Employee is Present");
         DailyWage=WagePhr*empHrs;
         System.out.println("Daily Wage is: "+DailyWage);
         
      }
      else if(Attendance==2)
      {
         empHrs=4;
         System.out.println("PartTime");
         DailyWage=WagePhr*empHrs;
         System.out.println("PartTime Wage is: "+DailyWage);
      }
      else
      {
         System.out.println("Employee is Absent");
      }
   }
}