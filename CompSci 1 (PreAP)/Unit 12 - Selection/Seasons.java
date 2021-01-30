package Unit12;
import java.util.*;

public class Seasons
{
    Scanner keyboard = new Scanner(System.in);
    String season;
    public Seasons () {
        System.out.print("Enter a season -->  ");
        season = keyboard.next();
        System.out.printf("\n" + getSeasonInfo(season) + "\n");
    }
    public String getSeasonInfo(String season) {
        
        if (season.equalsIgnoreCase("winter")) {
            return ("Season: Winter\n  Meteorological:\n    December 20 - March 20\n  Astronomical:\n    Winter Solstice - Vernal Equinox");
        }
        if (season.equalsIgnoreCase("summer")) {
            return ("Season: Summer\n  Meteorological:\n    June 21 - September 22\n  Astronomical:\n    Summer Solstice - Autumnal Equinox");
        }
        if (season.equalsIgnoreCase("autumn") || season.equalsIgnoreCase("fall")) {
            return ("Season: Fall\n  Meteorological:\n    September 22 - December 21\n  Astronomical:\n    Autumnal Equinox - Winter Solstice");
        }
        if (season.equalsIgnoreCase("spring")) {
            return ("Season: Spring\n  Meteorological:\n    December 21 - March 20\n  Astronomical:\n    Vernal Equinox - Summer Solstice");
        }
        return null;
    }
    public static void main(String[] args) 
    {
        new Seasons();
    }
}
