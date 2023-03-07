import java.util.*;
import java.util.Random;
public class EmpWageComputation
{
     
   public static void main(String args[])
   {
      int DailyWage=0,WagePhr=20,empHrs;
      int WorkingDays=20,c=0,k=0;
      int DailyParttime=0;
      System.out.println("Welcome to Employee Wage Computation Program");
      Random rand = new Random();
      int Days=0, Hrs=0;
     
      for(int i=0;i<WorkingDays;i++)
      {

         int Attendance = rand.nextInt(3);
         switch(Attendance)
         {
            case 1:
               empHrs=8;
               System.out.println("Employee is Present");
               DailyWage=WagePhr*empHrs;
               System.out.println("Daily Wage is: "+DailyWage);
               c++;
               Days++;
               Hrs+=empHrs;
            break;
            case 2:
               empHrs=4;
               System.out.println("PartTime");
               DailyParttime=WagePhr*empHrs;
               System.out.println("PartTime Wage is: "+DailyParttime);
               k++;
               Days++;
               Hrs+=empHrs;
            break;
            case 0:
         
               System.out.println("Employee is Absent");
               Days++;
            break;
         }
   }
     int TotalSalary=(DailyWage*c)+(k*DailyParttime) ;
     System.out.println("Salary is: "+TotalSalary);  
   }
}