package Project7;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Employee implements Serializable{

    private double EmployeeID;
    private BigDecimal FedTax;
    private BigDecimal StateTax;
    private BigDecimal TotalTax;
    private BigDecimal NetPay;
    private BigDecimal WeekGrossPay;
    private BigDecimal PayRate;
    private BigDecimal GrossPay;
    private boolean Salary;


    public Employee(ObjectOutputStream oo, ObjectInputStream input)
    {
        boolean go = true;
        double ID;
        char e;
        boolean s;
        BigDecimal r;
        BigDecimal Ft;
        BigDecimal St;
        BigDecimal d=new BigDecimal("0");
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello.  Do you have employees to enter?(y/n)");
        e = scan.next().charAt(0);
        scan.nextLine();
        if(e=='y')
        {
            System.out.println("What is the federal tax rate (it's .10 of the gross pay)");
            Ft = new BigDecimal(scan.nextLine());
            System.out.println("What is the state tax rate (it's .05 of the gross pay)");
            St = new BigDecimal(scan.nextLine());
            while(go)
            {
                System.out.println("What is the employee's ID?");
                ID = scan.nextDouble();
                scan.nextLine();
                System.out.println("Is the employee a salary man or an hourly worker?(h/s)");
                switch(scan.next().charAt(0)) {
                    case ('s'):
                    {
                        scan.nextLine();
                        s = true;
                        System.out.println("How much does this employee make a year?");
                        d = new BigDecimal(scan.nextLine());
                        break;
                    }
                    case('h'):
                    {
                        scan.nextLine();
                        System.out.println("How many hours does this employee work a week?");
                        d = new BigDecimal(scan.nextLine());
                        s = false;
                        break;
                    }
                    default:
                    {
                        s=false;
                        System.out.println("This should not have happened");
                        //I am going to assume they did it correctly for right now
                    }
                }
                Employee Emp = new Employee(ID,s,Ft,St,d);

                try {
                    oo.writeObject(Emp);
                } catch (IOException e1) {

                }
                System.out.println("Do you have more employees to enter?(y/n)");
                go = (scan.nextLine().charAt(0)=='y');
            }
        }
        else
        {
            System.out.println("No employees were entered.");
        }
    scan.close();

    }
    //I
    public Employee(double I, boolean s, BigDecimal Ft, BigDecimal St, BigDecimal d)
    {
        EmployeeID = I;
        Salary = s;

        calcWeekGrossPay(d);
        calcGrossPay();
        calcFedTax(Ft);
        calcStateTax(St);
        TotalTax = FedTax.add(StateTax);
        calcNetPay();
    }


    public void calcGrossPay()
    {
        GrossPay = WeekGrossPay.multiply(new BigDecimal("52"));
    }
    //if the employee is a salary man d is the salary of the employee
    //if the employee is payed hourly d is the number of hours worked in a week.
    public void calcWeekGrossPay(BigDecimal d)
    {
        if(Salary) {
            WeekGrossPay = d.divide(new BigDecimal("52"),20, RoundingMode.HALF_UP);
        }
        else
        {
            System.out.println("How much does this employee make an hour?");
            Scanner scan = new Scanner(System.in);
            PayRate = new BigDecimal(scan.nextLine());
            //Copied from Employee2 in package Payroll assuming works

            if(d.compareTo(new BigDecimal(40))==-1||d.compareTo(new BigDecimal(40))==0)
            {
                WeekGrossPay=d.multiply(PayRate);
            }

            if(d.compareTo(new BigDecimal(40))==1&&(d.compareTo(new BigDecimal(50))==-1||d.compareTo(new BigDecimal(50))==0))
            {
                WeekGrossPay = (PayRate.multiply(new BigDecimal(40))).add(((d.subtract(new BigDecimal(40))).multiply(PayRate.multiply(new BigDecimal("1.5")))));
            }

            if(d.compareTo(new BigDecimal("50"))==1)
            {//                   First block                          second block                                                                                         third block
                WeekGrossPay=( (PayRate.multiply(new BigDecimal(40))).add(((new BigDecimal("10")).multiply(PayRate.multiply(new BigDecimal("1.5")))))).add(d.subtract(new BigDecimal("50")).multiply((PayRate.multiply(new BigDecimal("2")))));
            }
        }
    }
    private void calcFedTax(BigDecimal R)
    {
        FedTax = GrossPay.multiply(R);
    }
    private void calcStateTax(BigDecimal R)
    {
        StateTax = GrossPay.multiply(R);
    }
    private void calcNetPay()
    {
        NetPay = GrossPay.subtract(TotalTax);
    }

    public String toString()
    {
        String result = "";

        result = result + String.format("Employee ID:         %.2f %n", EmployeeID);
        result = result + String.format("Week gross pay:      %.2f %n", WeekGrossPay);
        result = result + String.format("Total gross pay:     %.2f %n" , GrossPay );
        result = result + String.format("Federal tax payed:   %.2f %n" , FedTax);
        result = result + String.format("State tax payed:     %.2f %n" , StateTax);
        result = result + String.format("Total tax payed:     %.2f %n", TotalTax);
        result = result + String.format("Net pay after taxes: %.2f %n ",  NetPay);
        return result;
    }




}
