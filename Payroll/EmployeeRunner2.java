package Payroll;

import java.util.Scanner;

public class EmployeeRunner2 {
	public static void main(String[] args)
	{
		int numEmp=0;
		double avgPay = 0;
		double totalPay = 0;
		boolean go = true;
		double rate = 0;
		double hoursWorked = 0;
		String name = "";
		Scanner scan = new Scanner(System.in);
		
		while(go)
		{
			System.out.println("Enter the Name of the employee.");//make a method
			name = scan.nextLine();
			System.out.println("Please enter the pay rate of the employee being entered.");//make a method
			rate = scan.nextDouble();
			scan.nextLine();
			System.out.println("Please enter the hours the employee worked."); //make a method
			hoursWorked = scan.nextDouble();
			scan.nextLine();
			Employee bob = new Employee(hoursWorked, rate, name);
			totalPay = totalPay + bob.getPayLastWeek();
			System.out.printf("%s made $%.2f last week.%n", name, bob.getPayLastWeek());
			numEmp++;
			System.out.println("would you like to input more employees?(y/n)");
			go = (scan.next().equals("y"));
			scan.nextLine();
			
		}
		scan.close();
		if(numEmp>0)
		{
			avgPay = totalPay/numEmp;
			System.out.printf("The employees made an average of $%.2f.", avgPay);
		}
		else
		{
			System.out.printf("No employees were entered.");
		}
		
		
	}
}
