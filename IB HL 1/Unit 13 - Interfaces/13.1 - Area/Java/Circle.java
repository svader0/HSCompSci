public class Circle implements Shape
{
    double radius;
    
    Circle (double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double getArea() 
    {
        return (3.14 * (Math.pow(radius, 2.0))); // area = pi x radius^2
    }
        
}
