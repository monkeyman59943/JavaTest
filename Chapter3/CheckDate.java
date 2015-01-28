import java.util.*;

public class CheckDate
{
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

	public CheckDate()
	{

	}

	public static boolean checkDay(int d, int m)
	{
		if(d > 0 && d < days[m] )
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}