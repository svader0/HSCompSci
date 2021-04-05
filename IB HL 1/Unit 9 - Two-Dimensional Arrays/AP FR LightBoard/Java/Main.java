public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Rules");
        System.out.println("1. If the light is on, return false if the number of\n"
                + " lights in its column that are on is even, including the current light.");
        System.out.println("2. If the light is off, return true if the number of\n"
                + " lights in its column that are on is divisible by three.");
        System.out.println("3. Otherwise, return the light’s current status.");
        System.out.println("\n");
        LightBoard board1 = new LightBoard();
        board1.printBoard();
        
        System.out.println("evaluateLight(0, 3) = "+ board1.evaluateLight(0, 3));
        System.out.println("evaluateLight(6, 0) = "+ board1.evaluateLight(6, 0));
        System.out.println("evaluateLight(4, 1) = "+ board1.evaluateLight(4, 1));
        System.out.println("evaluateLight(5, 4) = "+ board1.evaluateLight(5, 4));
        System.out.println(); System.out.println();
        
        LightBoard board2 = new LightBoard(2, 2);
        board2.printBoard();
        
        System.out.println("evaluateLight(0, 0) = "+ board2.evaluateLight(0, 0));
        System.out.println("evaluateLight(1, 1) = "+ board2.evaluateLight(1, 1));
        System.out.println(); System.out.println();
        
        LightBoard board3 = new LightBoard(4, 4);
        board3.printBoard();
        
        System.out.println("evaluateLight(1, 0) = "+ board3.evaluateLight(1, 0));
        System.out.println("evaluateLight(1, 3) = "+ board3.evaluateLight(1, 3));
        System.out.println("evaluateLight(2, 2) = "+ board3.evaluateLight(2, 2));
        System.out.println(); System.out.println();
        
        
    }
    
}