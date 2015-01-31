// package Chapter3;

import java.time.LocalDateTime;


class HeartRates
{

    LocalDateTime currentDateTime = LocalDateTime.now();
    int day, month, year,age;
    double maxHR, tHRH, tHRL, tHRA;
    String nameF, nameL;

    public HeartRates(int d, int m, int y, String nF, String nL)
    {
        day = d;
        month = m;
        year = y;
        nameF = nF;
        nameL = nL;
        //runs the required methods to calculate the values for maxHR and target heartrate and the age of the person
        calcAge();
        calcMaxRate();
        calcTargetRate();

    }



    //Setters

    public void setMonth(int m)
    {
        month = m;
    }
    public void setYear(int y)
    {
        year = y;
    }
    public void setDay(int d)
    {
        day = d;
    }
    public void setFirstName(String f)
    {
        nameF = f;
    }
    public void setLastName(String l)
    {
        nameL = l;
    }




    //getters
    public  int getAge()
    {
        return age;
    }
    public  double getMaxHR()
    {
        return maxHR;
    }
    public  double getAvgTHR()
    {
        return tHRA;
    }
    public  int getMonth()
    {
        return month;
    }
    public  int getYear()
    {
        return year;
    }
    public  int getDay()
    {
        return day;
    }
    public  String getFirstName()
    {
        return nameF;
    }
    public  String getLastName()
    {
        return nameL;
    }



    //Other Functions
    int calcMaxRate()
    {
        maxHR = 220 - age;
        return (220 - age);
    }
    public double calcTargetRate()
    {
        //Low end of the target heart rate is 50% of the max heart rate
        tHRL =  maxHR * 0.5;
        //High end of the target heart rate is 85% of the max heart rate
        tHRH = maxHR*0.85;
        tHRA = (tHRH + tHRL)/2.0;
        return (tHRH + tHRL)/2.0;
    }
    public int calcAge()
    {//This only works in java so it's commented out

		age = currentDateTime.getYear()-year- 1;

		if(currentDateTime.getMonthValue()>month)
		{
		age++;
		}
		if(currentDateTime.getMonthValue()==month)
		{
			if(currentDateTime.getDayOfMonth()>=day)
			{
			age++;
			}
		}
    return age;

    }



}
//This is a test