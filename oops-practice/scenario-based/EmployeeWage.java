package employee_wage;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeWage {

     int wagePerHour = 20;
     int fullDayHour = 8;
     int partTimeHour = 4;
     int maxDays = 20;
     int maxHours = 100;

     ArrayList<Integer> dailyWages = new ArrayList<>();

     void calculateWage() {

          System.out.println("Welcome to Employee Wage Computation Program");

           int totalDays = 0;
           int totalHours = 0;
           int totalSalary = 0;

         Random random = new Random();

       while (totalDays < maxDays && totalHours < maxHours) {

             totalDays++;
             int empType = random.nextInt(3);
             int hoursWorked;

           switch (empType) {
                 case 1:
                    hoursWorked = fullDayHour;
                    break;

                 case 2:
                    hoursWorked = partTimeHour;
                    break;

                 default:
                    hoursWorked = 0;
           }

           if (totalHours + hoursWorked > maxHours) {
                hoursWorked = maxHours - totalHours;
            }

           int dailyWage = hoursWorked * wagePerHour;

           dailyWages.add(dailyWage);
           totalHours += hoursWorked;
           totalSalary += dailyWage;
        }

         System.out.println("Total Working Days: " +totalDays);
          System.out.println("Total Working Hours: " + totalHours);
         System.out.println("Monthly Salary: " + totalSalary);
         System.out.println("Daily Wages: " +dailyWages);
    }

    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        emp.calculateWage();
    }
}
