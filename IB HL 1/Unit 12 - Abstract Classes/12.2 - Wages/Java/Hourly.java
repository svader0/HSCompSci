public class Hourly extends Employee
{

    private int hoursWorked;
    private double hourlyWage;

    public Hourly(String n, String s, double wage, int hours) 
    {
        super(n,s);
        hourlyWage = wage;
        hoursWorked = hours;
    };

    @Override
    public double getSalary() 
    {
        double salary = hourlyWage * hoursWorked;
        if (salary - 160 > 0) 
        {
            salary += (salary - 160) * 1.5;
        }
        return salary;
    }
}