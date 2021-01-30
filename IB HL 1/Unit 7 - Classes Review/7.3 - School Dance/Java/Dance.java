public class Dance
{

   public final int GoldPass = 1;
   public final int SilverPass = 2;
   public final int BronzePass = 3;
   public final int NoPass = 4;
   
   public int attendance;
   public double ticketSales;

   public Dance()
   {
	attendance = 0;
    ticketSales = 0;
   }
   
   public void buyTicket(int code)
   {
      switch(code) {
               case 1:
                   attendance++;
                   ticketSales += 0;
                   break;
               case 2:
                   attendance++;
                   ticketSales += 2.0;
                   break;
               case 3:
                   attendance++;
                   ticketSales += 4.0;
                   break;
               case 4:
                   attendance++;
                   ticketSales += 6.0;
                   break;
               default:
                   System.out.println("invalid");
     }
   }

   public int getAttendance()
   {
     return attendance;
   }
   
   public double getTicketSales()
   {
      return ticketSales;
   } 
}