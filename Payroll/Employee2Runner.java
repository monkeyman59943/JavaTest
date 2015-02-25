package Payroll;
import java.math.BigDecimal;
import java.util.*;
/**
 * Created by Jacob on 2/25/2015.
 */
public class Employee2Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigDecimal pay = new BigDecimal("0");
        ArrayList<Employee2> Employees = new ArrayList<Employee2>();
        System.out.println("Do you have employees to enter?(y/n)");
        boolean go = scan.next().equals("y");
        scan.nextLine();
        while(go)
        {
            System.out.println("What is the name of this employee?");
            Employee2 e = new Employee2(scan.nextLine());
            Employees.add(e);
            System.out.println("Do you have more employees to enter?(y/n)");
            go = scan.next().equals("y");
            scan.nextLine();
        }
        if(Employees.size()>0)
        {
            for (Employee2 d : Employees) {
                System.out.printf("%s made $%.2f Last week%n", d.getName(), d.getPayLastWeek());
                pay = pay.add(d.getPayLastWeek());
            }

                    System.out.printf("The employees made an average of $%.2f each", pay.divide(new BigDecimal(Employees.size())));
        }
        scan.close();
    }
}
