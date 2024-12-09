package Project.SmallProjects.WarmWeather;

// Chapter 6 Question 16
public class WarmWeather
{
    public static void main(String[] args)
    {
        boolean warm = false;

        // so i dont get erros
        Location location = new Location();
        Weather weather = new Weather();
        Time time = new Time();


        if(location.isTropics())
        {
            warm = true;
        }
        else if (time.getMonth() == 4 || time.getMonth() == 10)
        {
            if (weather.isSunny())
            {
                warm = true;
            }
        }
        else if (location.isNorthernHemisphere())
        {
            if(time.getMonth() >= 5 && time.getMonth() <= 9)
            {
                warm = true;
            }
        }
        else if (location.isSouthernHemisphere())
        {
            if(time.getMonth() >= 11 ||time.getMonth()<= 3)
            {
                warm = true;
            }
        }
    }
}


