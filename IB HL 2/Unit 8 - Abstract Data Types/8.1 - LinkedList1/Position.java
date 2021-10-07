public class Position
{
   // instance variables
   private int x;
   private int y;
            
   // constructor
   public Position(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
            
   // accessor methods (getters)
   public int getX()
   {
      return x;
   }
            
   public int getY()
   {
      return y;
   }
            
   // mutator methods (setters)
   public void setX(int x)
   {
      this.x = x;
   }
            
   public void setY(int y)
   {
      this.y = y;
   }
            
   // toString method
   public String toString()
   {
      return "(" + getX() + "," + getY() + ")";
   }
}