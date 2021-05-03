public class Salary extends Employee
{

    private double yearlySalary;

    public Salary(String n, String s, double yearly) 
    {
        super(n,s);
        yearlySalary = yearly;
    };
    
    @Override
    public double getSalary() {
        return(yearlySalary / 12);
    }
    
}
