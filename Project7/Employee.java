package Project7;

import java.math.BigDecimal;

/**
 * Created by Jacob on 3/3/2015.
 */
public class Employee {
    private double EmployeeID;
    private BigDecimal FedTax;
    private BigDecimal StateTax;
    private BigDecimal TotalTax;
    private BigDecimal NetPay;
    private BigDecimal WeekGrossPay;
    private boolean Salary;


    public Employee()
    {

    }
    //This is used if the employee is a salary man
    //s is the salary for the employee
    public void calcWeekGrossPay(BigDecimal s)
    {
            WeekGrossPay = s.divide(new BigDecimal("52"));
    }

    public void calcWeekGrossPay(double h)
    {

    }



}
