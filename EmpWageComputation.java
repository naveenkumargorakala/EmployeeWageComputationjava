package com.BridgeLabz.basics;
import java.util.Random;
import java.util.Scanner;

public class EmpWageComputation {
    int DailyWage=0,EmpHrs=0,c=0,k=0;
    int WorkingHrs=0;
  public void employeesalary(int WagePerHr,int WorkingDays)
  {
      Random rand = new Random();
      for(int i=0;i<WorkingDays;i++)
      {
          int attendance = rand.nextInt(3);
          switch(attendance)
          {
              case 1:
                  EmpHrs=8;
                  DailyWage=WagePerHr*EmpHrs;
                  System.out.println("Employee Present"+DailyWage);
                  WorkingHrs+=8;
                  c++;
                  break;
              case 2:
                  EmpHrs=4;
                  DailyWage=EmpHrs*WagePerHr;
                  System.out.println("PartTime Wage"+DailyWage);
                  WorkingHrs+=4;
                  k++;
                  break;
              case 0:
                  System.out.println("Employee is Absent");
                  break;
          }
      }
      int TotalSalary=WorkingHrs*WagePerHr;
      System.out.println("TotalSalary: "+TotalSalary);
      System.out.println("FullTime Days: "+c);
      System.out.println("PartTime Days: "+k);
      System.out.println("Total Working hours are: "+WorkinghHrs);
  }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmpWageComputation Company1 = new EmpWageComputation();
        EmpWageComputation Company2 = new EmpWageComputation();
        Scanner input = new Scanner(System.in);
        System.out.println("WagePerHr is: ");
        int WagePerHr = input.nextInt();
        System.out.println("No.of Working Days: ");
        int WorkingDays = input.nextInt();
        System.out.println("Company1 employee salary: ");
        Company1.employeesalary( WagePerHr, WorkingDays);
        System.out.println("Company2 Employee Salary:  ");
        Company2.employeesalary(80,22);
    }
}
