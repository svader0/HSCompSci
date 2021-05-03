public class Platinum extends Donation
{

    Platinum(String name) 
    {
        super(name);
    }

    @Override
    public String getClub() 
    {
        return "Platinum";
    }

    @Override
    public double getAmount()
    {
        return 1000.00;
    }    
}
