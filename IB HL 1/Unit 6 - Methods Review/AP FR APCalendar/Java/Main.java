public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Part A - numberOfLeapYears Test");
        System.out.println("-------------------------------");
        System.out.println("Number of leap years from 1800 to 1900 = " + APCalendar.numberOfLeapYears(1800, 1900));
        System.out.println("Number of leap years from 1920 to 2020 = " + APCalendar.numberOfLeapYears(1920, 2020));
        System.out.println("Number of leap years from 2020 to 2030 = " + APCalendar.numberOfLeapYears(2020, 2030));
        System.out.println("\n");
        System.out.println("Part B - dayOfWeek Test");
        System.out.println("-----------------------");
        
        System.out.println("Day of the week for Jan 5, 2019 = " + APCalendar.dayOfWeek(1, 5, 2019));
        System.out.println("Day of the week for Jan 10, 2020 = " + APCalendar.dayOfWeek(1, 10, 2020));
        System.out.println("Day of the week for March 12, 2020 = " + APCalendar.dayOfWeek(3, 12, 2020));
        System.out.println("Day of the week for May 21, 2020 = " + APCalendar.dayOfWeek(5, 21, 2020));
        System.out.println("Day of the week for June 15, 2021 = " + APCalendar.dayOfWeek(6, 15, 2021));
		

    }
}