public class MemoryPacket extends StarterPacket 
{
    private int photo5x7;
    private int photoWallets;

    public MemoryPacket() 
    {
        super();
        photo5x7 = 2;
        photoWallets = 8;
    }

    @Override
    public String getPacketName() 
    {
        return "Memory Packet";
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\n" +
        "5 x 7 = " + photo5x7 +
        "\nWallet photo = " + photoWallets;
    }
}
