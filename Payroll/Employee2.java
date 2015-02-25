package Payroll;
import java.math.BigDecimal;
import java.util.*;


/**
 * Created by Jacob on 2/25/2015.
 */
public class Employee2 {
    private Scanner scan = new Scanner(System.in);
    private BigDecimal payLastWeek = new BigDecimal("0");
    private BigDecimal hoursWorked = new BigDecimal("0");
    private BigDecimal payRate = new BigDecimal("0");

    private String name;

    public Employee2(String n)
    {
        name = n;
        setHoursWorked();
        setPayRate();
        calcPay();
    }

    public void setHoursWorked()
    {
        System.out.println("How many hours did " + name + " work last week?");
        hoursWorked = new BigDecimal(scan.nextDouble());
        scan.nextLine();
    }
    public void setPayRate()
    {
        System.out.println("How much does this employee make per hour?");
        payRate = new BigDecimal(scan.nextDouble());
        scan.nextLine();
    }

    public void calcPay()
    {
        if(hoursWorked.compareTo(new BigDecimal(40))==-1||hoursWorked.compareTo(new BigDecimal(40))==0)
        {
            payLastWeek=hoursWorked.multiply(payRate);
        }

        if(hoursWorked.compareTo(new BigDecimal(40))==1&&(hoursWorked.compareTo(new BigDecimal(50))==-1||hoursWorked.compareTo(new BigDecimal(50))==0))
        {
            payLastWeek = (payRate.multiply(new BigDecimal(40))).add(((hoursWorked.subtract(new BigDecimal(40))).multiply(payRate.multiply(new BigDecimal("1.5")))));
        }

        if(hoursWorked.compareTo(new BigDecimal("50"))==1)
        {//                   First block                          second block                                                                                         third block
            payLastWeek=( (payRate.multiply(new BigDecimal(40))).add(((new BigDecimal("10")).multiply(payRate.multiply(new BigDecimal("1.5")))))).add(hoursWorked.subtract(new BigDecimal("50")).multiply((payRate.multiply(new BigDecimal("2"))))                               );
        }
    }

    public BigDecimal getHoursWorked() {
        return hoursWorked;
    }
    public BigDecimal getPayLastWeek()
    {
        return payLastWeek;
    }
    public BigDecimal getPayRate()
    {
        return payRate;
    }

    public String getName()
    {
        return name;
    }

}//end of class
