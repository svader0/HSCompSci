package Unit7;


public class RandomRanges 
{
    public static void main(String[] args) 
    {
        int num1 = (int)(Math.random() * 25) + 1;
        int num2 = (int)(Math.random() * 3) + 1;
        int num3 = (int)(Math.random() * 50) + 50;
        int num4 = (int)(Math.random() * -10) - 1;
        int num5 = (int)(Math.random() * 200) - 100;
        int num6 = (int)(Math.random() * 26) + 65;
        int num7 = (int)(Math.random() * 999) + 1;
        int num8 = (int)(Math.random() * 10) + 1;
        
        System.out.println("RANDOM RANGES\n=======================");
        System.out.println("Range: 0 to 25 = " + num1);
        System.out.println("Range: 1 to 3 = " + num2);
        System.out.println("Range: 50 to 100 = " + num3);
        System.out.println("Range: -1 to -10 = " + num4);
        System.out.println("Range: -100 to 100 = " + num5);
        System.out.println("Range: A to Z = " + (char)num6);
        System.out.println("Range: 0.1 to 1 = " + (double)num7 / 1000);
        System.out.println("Range: 1000 to 10000 (counting by 1000) = " + num8 * 1000 + "\n");
    }
}
