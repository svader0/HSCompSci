public class CollectorPacket extends StarterPacket
{
    private int photoWallets;

    public CollectorPacket() 
    {
        super();
        photoWallets = 8;
    }

    @Override
    public String getPacketName() 
    {
        return "Collector Packet";
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\n" +
        "Wallet Photo = " + photoWallets;
    }
}
