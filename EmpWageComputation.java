import java.util.*;
public class EmpWage
{
   public static void main(String args[])
   {  
      int DailyWage,WagePhr=20,empHrs;
      System.out.println("Welcome to Employee Wage Computation Program");
       Random rand = new Random();
       int Attendance= rand.nextInt(2);
       if(Attendance==1)
       {
          System.out.println("Employee is Present");
          empHrs=8;
          System.out.println("Employee is Present");
          DailyWage=WagePhr*empHrs;
          System.out.println("Daily Wage is: "+DailyWage);
       }
       else
       {
          System.out.println("Employee is Absent");
       }
   }
}