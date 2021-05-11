class Advance extends Ticket 
{

    int days;

    public Advance(int days) 
    {
        super();
        this.days = days;
    }

    @Override
    public double getPrice() {
        if (days >= 10) 
        {
            return 30;
        }
        return 40;
    }
    
}