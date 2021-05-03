public class Gold extends Donation 
{
    
    Gold(String name) 
    {
        super(name);
    }

    @Override
    public String getClub() 
    {
        return "Gold";
    }

    @Override
    public double getAmount()
    {
        return 500.00;
    }
}
