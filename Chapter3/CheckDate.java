import java.util.*;
import java.time.LocalDateTime;

public class CheckDate
{
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    static LocalDateTime currentDateTime = LocalDateTime.now();
	public CheckDate()
	{

	}

	public static boolean checkDay(int d, int m)
	{
		if(m<=0)
		{
			return false;
		}
		if(d > 0 && d <= days[m-1])
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static boolean checkYear(int y)
    {
        if(currentDateTime.getYear()-220<0)
        {
            System.out.println("The year you have entered is too low.");
            return false;
        }
        if(y > currentDateTime.getYear())
        {
            System.out.println("The year you have entered is beyond the current year.");
            return false;
        }
        else return true;
    }
    public static boolean checkDate(int d, int m, int y)
    {
    	if( y == currentDateTime.getYear())
    	{
    		if(m > currentDateTime.getMonthValue())
    		{
    			return false;
    		}
    		else if(m == currentDateTime.getMonthValue())
    		{
    			if(d>currentDateTime.getDayOfMonth())
    			{
    				return false;
    			}

    		}
    		else
    		{
    			return true;
    		}
    	}
    	return true;
    }
}