package Unit4;
import java.util.*;

public class Baseball 
{
    public static void main(String[] args) 
    {
        int hits = 27;
        int atBats = 80;
        int roundedAvg = 0;
        
        double battingAvg = ((double) hits / atBats);
        
        battingAvg = (battingAvg + 0.0005);
        
        battingAvg *= 1000;
        roundedAvg = (int)battingAvg;
        
        System.out.println("Hits = " + hits);
        System.out.println("At Bats = " + atBats);
        System.out.println("-------------");
        System.out.println("Batting avg = " + roundedAvg);
        
    }
}
