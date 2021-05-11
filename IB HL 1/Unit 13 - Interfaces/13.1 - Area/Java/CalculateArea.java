public class CalculateArea
{
    public CalculateArea()
    {
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(5);
        
        System.out.println("Rectangle");
        System.out.println("----------");
        printArea(rectangle);
        System.out.println("Circle");
        System.out.println("------");
        printArea(circle);    
    }
    
    // prints the area of the given shape
    public void printArea(Shape shape)
    {
        System.out.println(shape.getArea());
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        new CalculateArea();
    }
}