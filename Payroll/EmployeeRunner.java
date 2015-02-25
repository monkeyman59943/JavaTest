package Payroll;
import java.util.*;

public class EmployeeRunner {
	public static void main(String[] args)
	{
		double avgPay = 0;
		double totalPay = 0;
		boolean go = true;
		double rate = 0;
		double hoursWorked = 0;
		String name = "";
		Scanner scan = new Scanner(System.in);
		
		//This is the ArrayList that will hold all of the employees
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		//This loop gets all of the employees
		while(go)
		{
			System.out.println("Enter the Name of the employee.");
			name = scan.nextLine();
			System.out.println("Please enter the pay rate of the employee being entered.");
			rate = scan.nextDouble();
			scan.nextLine();
			System.out.println("Please enter the hours the employee worked");
			hoursWorked = scan.nextDouble();
			scan.nextLine();
			Employee bob = new Employee(hoursWorked, rate, name);
			employees.add(bob);
			System.out.println("would you like to input more employees?(y/n)");
			go = (scan.next().equals("y"));
			scan.nextLine();
		}
		//closes the scanner
		scan.close();
		//If employees were entered with will calculate and print the amount that each employee 
		//last week and then print the total money made
		//and the average money made per employee
		if(employees.size()>0)
		{
			//goes through all of the employees and prints the money that they made last week
			for(Employee D: employees)
			{
				System.out.printf("%s earned $%.2f last week.%n",D.getName(), D.getPayLastWeek());
				totalPay = totalPay + D.getPayLastWeek();
			}
			avgPay = totalPay/employees.size();
			System.out.printf("The employees made a total of $%.2f lastWeek with an "
					+ "average of $%.2f per employee.%n", totalPay, avgPay);
		}
		else
		{
			System.out.println("No employees were entered%n");
		}
		
	}
}
