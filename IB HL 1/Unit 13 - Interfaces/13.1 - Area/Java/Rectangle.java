public class Rectangle implements Shape 
{
    private double length;
    private double width;

    public Rectangle(double l, double w) 
    {
        length = l;
        width = w;
    }

    @Override
    public double getArea() {
        return (length * width);
    }
}
