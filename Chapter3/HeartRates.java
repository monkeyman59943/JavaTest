 class HeartRate
{



	 //this doesn't work in c++ but becasue I am in a java class and not a c++ class I don't reall care so here is how to do it in hava.



    int day, month, year, maxHR, tHRL,tHRH, age;
    String nameF, nameL;
    Date date = new Date();
    public HeartRate(int d, int m, int y, String nF, String nL)
    {
        day = d;
        month = m;
        year = y;
        nameF = nF;
        nameL = nL;
        calcMaxRate();
        calcTargetRate();
        calcAge();
    }



    //Setters

    public void setAge(int a)
    {
        age = a;
    }
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
    public int getMonth()
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



    //Ohter Functions
    int calcMaxRate()
    {
        maxHR = 220 - age;
        return 220 - age;
    }
    public double calcTargetRate()
    {
        //Low end of the target heart rate is 50% of the max heart rate
        tHRL = (int)(((double) maxHR) * 0.5);
        //High end of the target heart rate is 85% of the max heart rate
        tHRH = (int)(((double)maxHR)*0.85);
        return (((double)tHRL) + ((double)tHRH)) / 2;
    }
    public int calcAge()
    {//This only works in java so it's commented out

		age = date.getYear()-year;
		if(date.getMonth()<month)
		{
		age++;
		}
		if(date.getMoth==month)
		{
			if(day >= date.getDate())
			{
			age++;
			}
		}


    }

};