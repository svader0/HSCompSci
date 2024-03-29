class StudentAdvance extends Advance
{

    public StudentAdvance(int days) {
        super(days);
    }

    @Override
    public double getPrice() {
        return super.getPrice() / 2;
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + " (student ID required)";
    }
}
