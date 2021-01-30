package Unit23;

public class PrintfPractice
{
   public void method1()
   {
      int benchPress = 280;
      int squats = 395;
 
       System.out.printf("%-15s%d%n%-15s%d%n", "Bench Press: ", benchPress, "Squats: ", squats);

   }
   
   public void method2()
   {
      double width = 10.74829;
      double length = 5.125;
       
       System.out.printf("%-15s%f%n%-15s%f%n", "Width: ", width, "Length: ", length);
       	   
   }
 
   public void method3()
   {
        for (int x = 0; x < 15; x++) {
           System.out.printf("%10d%n", ((int)(Math.random() * 200)));
        }

	   
   }
   
   public static void main(String[] args)
   {
      PrintfPractice app = new PrintfPractice();

      System.out.println("    Method 1");
      System.out.println("----------------");
      System.out.println();
      app.method1();          // call Method1
      System.out.println();
      System.out.println("    Method 2");
      System.out.println("----------------");
      System.out.println();
      app.method2();         // call Method2
      System.out.println();
      System.out.println("    Method 3");
      System.out.println("----------------");
      System.out.println();
      app.method3();        // call Method3
   }
}  