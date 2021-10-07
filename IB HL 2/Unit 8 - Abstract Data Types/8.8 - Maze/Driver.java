public class Driver
{
    public static void main(String[] args)
    {
        MazeModel mazeModel = new MazeModel();
        new MazeView(mazeModel);
    }
}