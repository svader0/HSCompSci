
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class APCalendar
{
 
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year)
    {
       LocalDate date = LocalDate.of(year, Month.JANUARY, 01);
       return date.isLeapYear();
    }
    //---------------------------  Part A -----------------------------------//
    /** Returns the number of leap years between year1 and year2, inclusive.
    * Precondition: 0 <= year1 <= year2
    */
    public static int numberOfLeapYears(int year1, int year2)
    {
		int leapYears = 0;

		
		
		while(year1 <= year2) {
            if(isLeapYear(year1)) {
                leapYears++;
                year1++;
            }
            else if(!isLeapYear(year1)) {
                year1++;
            }
        }

		return leapYears;
    }

    /** Returns the value representing the day of the week for the first day of year,
    * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
    */
    private static int firstDayOfYear(int year)
    {
        LocalDate date = LocalDate.of(year, Month.JANUARY, 01);
        LocalDate firstDayOfYear = date.with(TemporalAdjusters.firstDayOfYear());
        DayOfWeek day = firstDayOfYear.getDayOfWeek();
        if(day == DayOfWeek.SUNDAY)
            return 0;
        if(day == DayOfWeek.MONDAY)
            return 1;
        if(day == DayOfWeek.TUESDAY)
            return 2;
        if(day == DayOfWeek.WEDNESDAY)
            return 3;
        if(day == DayOfWeek.THURSDAY)
            return 4;
        if(day == DayOfWeek.FRIDAY)
            return 5;
        
        return 6;   // SATURDAY
    }

    /** Returns n, where month, day, and year specify the nth day of the year.
    * Returns 1 for January 1 (month = 1, day = 1) of any year.
    * Precondition: The date represented by month, day, year is a valid date.
    */
    private static int dayOfYear(int month, int day, int year)
    { 
       LocalDate date = LocalDate.of(year, month, day);
       return date.getDayOfYear();
    }

    //---------------------------  Part B ------------------------------------//
    /** Returns the value representing the day of the week for the given date
    * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
    * and 6 denotes Saturday.
    * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year)
    { 
		int currentDay = firstDayOfYear(year) - 1;
		for (int i = 0; i < dayOfYear(month, day, year); i++) {
			currentDay++;
			if (currentDay > 6) {
				currentDay = 0;
			}
			

			
		}
		return currentDay;
    }

}