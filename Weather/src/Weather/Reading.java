package Weather;

/**
 * Created by shsoni on 9/12/2016.
 */


public class Reading {

     private String  dayOfWeek;
     private int hrOfDay;
     private int temperature;
     private int windSpeed;
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getHrOfDay() {
        return hrOfDay;
    }

    public void setHrOfDay(int hrOfDay) {
        this.hrOfDay = hrOfDay;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Reading()
    {

    }

    public Reading(String line)
    {
        String[] elements = line.split(", ");
        setDayOfWeek(elements[0]);
        setHrOfDay(Integer.valueOf(elements[1]));
        setTemperature(Integer.valueOf(elements[2]));
        setWindSpeed(Integer.valueOf(elements[3]));

    }

    public String rateTemperature()
    {
        String temperatureMeasure = "";
         if(getTemperature() <= 55)
         {
             temperatureMeasure = "cold";
         }
         else if( getTemperature() > 55 && getTemperature() <= 65 )
         {
             temperatureMeasure = "mild";
         }
         else if( getTemperature() > 65 && getTemperature() <= 80)
         {
             temperatureMeasure = "warm";
         }
         else if (getTemperature() > 80)
         {
             temperatureMeasure = "hot";
         }
         return temperatureMeasure;
    }


    public String getTime()
    {
        String time = "";

        if(getHrOfDay() == 9)
        {
            time = "morning";
        }
        else if(getHrOfDay() == 16)
        {
            time = "afternoon";
        }
        else if(getHrOfDay() == 21)
        {
            time = "evening";
        }


        return getDayOfWeek() + " " + time;

    }


}
