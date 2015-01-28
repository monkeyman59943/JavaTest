// package Chapter3;
import java.util.Scanner;
/**
 * Created by Jacob on 1/28/2015.
 */
public class HeartRateRunner {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int day=0,year=0,month=0;//they are null for some logic to confirm they are entering correct days, months, and years
    	String last="",first="";
    	System.out.println("What day were you born?");
    	day = scan.nextInt();
    	System.out.println("What month were you born?");
    	month = scan.nextInt();
    	System.out.println("what year were you born?");
    	year = scan.nextInt();
    	System.out.println("What is your first name?");
    	first = scan.next();scan.nextLine();//The scan.nextLine() is used to clear the input stream
    	System.out.println("What is your last name?");
    	last = scan.next();scan.nextLine();//The scan.nextLine() is used to clear the input stream



        HeartRates Person = new HeartRates(day, month, year, first, last);
        //This is for clarity on where the output starts
        for(int i = 0;i<10; i++)
        {
        	System.out.println();
        }
        System.out.println("You are "+Person.getAge()+ " years old");
        System.out.println("Your maximum heart rate is " + Person.getMaxHR() + " beats per minute");
        System.out.println("Your target heart rate is " + Person.getAvgTHR() + " beats per minute");
    }
}
