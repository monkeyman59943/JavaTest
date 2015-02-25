package Payroll;
//Find a better way to calculate pay without using floating point values
//BigDecimal is a possible solution if I learn it
public class Employee {
	private double hoursWorked;
	private double payLastWeek;
	private double payRate;
	private double totalPayed=0;
	private String name;
	public Employee(double h, double r, String n)
	{
		name = n;
		hoursWorked = h;
		payRate = r;
		calcPay();
	}
	
	public void setHours(double hours)
	{
		hoursWorked = hours;
	}
	public void setPayRate(double r)
	{
		payRate = r;
	}
	public void setName(String n)
	{
		name = n;
	}
	
	public double getPayLastWeek()
	{
		return payLastWeek;
	}
	public double getPayRate()
	{
		return payRate;
	}
	public double getTotalPayed()
	{
		return totalPayed;
	}
	public String getName()
	{
		return name;
	}
	
	public void calcPay()
	{
		if(hoursWorked<=40)
		{
			payLastWeek=hoursWorked*payRate;
		}
		
		if(hoursWorked>40&&hoursWorked<=50)
		{
			payLastWeek=(40*payRate)+((hoursWorked-40)*(payRate/2)+payRate);
		}
		
		if(hoursWorked>50)
		{
			payLastWeek=(40*payRate)+((hoursWorked-40)*(payRate/2)+payRate)+((hoursWorked-50)*payRate*2);
		}
		totalPayed = totalPayed + payLastWeek;
	}
	
}
