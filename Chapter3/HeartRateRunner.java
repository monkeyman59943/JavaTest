// package Chapter3;
import java.util.Scanner;
/**
 * Created by Jacob on 1/28/2015.
 */
public class HeartRateRunner {
    public static void main(String[] args) {
    	int counter = 0;
    	Scanner scan = new Scanner(System.in);
    	int day=0,year=0,month=0;//they are null for some logic to confirm they are entering correct days, months, and years
    	String last="",first="";
    	//This whole loop is needed for the user to input their own values.
    	//start of the do while loop that makes sure a valid date is entered
       	do
       	{
       		//This is used to print the message asking for valid answers.  
       		//I couldn't think of another way to make sure this only goes on the second run
       		if(counter>0)
       		{
       			for(int i =0; i<5; i++)
       			{
       				System.out.println();
       			}
       			System.out.println("The date you entered is beyond the current date. \nPlease enter a date that has happened");
       		}
        System.out.println("What month were you born?");
        month = scan.nextInt();
        while(month>12||month<1)
        {
            System.out.println("That is not a valid month please type a month that is between 1 and 12");
            month = scan.nextInt();
        }
    	System.out.println("What day were you born?");
    	day = scan.nextInt();
        while(!CheckDate.checkDay(day,month))
        {
            System.out.println("That is not a valid day.  Please enter a day that is valid.");
            day = scan.nextInt();
        }

    	System.out.println("what year were you born?");
    	year = scan.nextInt();
    	while(!CheckDate.checkYear(year))
    	{
    		System.out.println("please type in a valid year.");
    		year = scan.nextInt();
    	}
    	counter++;
    	}while(!CheckDate.checkDate(day,month,year));
    	//end of the do while loop that makes a check for the valid date and repeats if it is beyond the current date




    	System.out.println("What is your first name?");
    	first = scan.next();scan.nextLine();//The scan.nextLine() is used to clear the input stream
    	System.out.println("What is your last name?");
    	last = scan.next();scan.nextLine();//The scan.nextLine() is used to clear the input stream


    	//This is where the person is created
        HeartRates person = new HeartRates(day, month, year, first, last);
        //This is for clarity on where the output starts
        for(int i = 0;i<10; i++)
        {
        	System.out.println();
        }
        System.out.println("Your name is " + person.getFirstName() + " " + person.getLastName());
        System.out.println("You are "+person.getAge()+ " years old");
        System.out.println("Your Date of birth is " + person.getMonth() + "/" + person.getDay() + "/" + person.getYear());
        System.out.println("Your maximum heart rate is " + person.getMaxHR() + " beats per minute");
        System.out.println("Your target heart rate is " + person.getAvgTHR() + " beats per minute");
    }
}
