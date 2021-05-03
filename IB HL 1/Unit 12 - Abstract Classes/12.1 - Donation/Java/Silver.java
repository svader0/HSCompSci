public class Silver extends Donation 
{
    
    Silver(String name) 
    {
        super(name);
    }

    @Override
    public String getClub() 
    {
        return "Silver";
    }

    @Override
    public double getAmount()
    {
        return 100.00;
    }
}
