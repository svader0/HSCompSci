public class AllStarPacket extends StarterPacket
{
    private int photoMagazineCover;
    private int photoTradingCards;

    public AllStarPacket() 
    {
        super();
        photoMagazineCover = 1;
        photoTradingCards = 16;
    }

    @Override
    public String getPacketName() 
    {
        return "All-star Packet";
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\n" +
        "Magazine Cover = " + photoMagazineCover +
        "\nTrading card = " + photoTradingCards;
    }
}
