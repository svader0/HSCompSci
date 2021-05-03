public class Football extends SportsTeam
{
    // instance variables
    private int numTouchdowns;
    private int numInterceptions;

    
    // first constructor 
    public Football(String name)
    {
        super(name);
        numTouchdowns = 0;
        numInterceptions = 0;
    }
    
    // second constructor
    public Football(String name, int gamesPlayed, int gamesWon, int gamesLost, int t, int f)
    {
        super(name, gamesPlayed, gamesWon, gamesLost);
        this.numTouchdowns = t;
        this.numInterceptions = f;
    }
    
    // accessor - getTouchDownsPerGame
    // calculates and returns the touchdowns per game by
    // dividing number of touchdowns by games played
    public double getTouchDownsPerGame()
    {
        return (double)((double)numTouchdowns / (double)super.getGamesPlayed());
    }
    
    // accessor - getInterceptionsPerGame
    // caculates and returns the interceptions per game by
    // dividing number of interceptions by games played
    public double getInterceptionsPerGame()
    {
        return (double)((double)numInterceptions / (double)super.getGamesPlayed());
    }
    
    // toString method
    public String toString()
    {
        return (
            new String(super.toString() + 
            "\nTouchdowns              = " + numTouchdowns + 
            "\nInterceptions           = " + numInterceptions +
            "\nTouchdowns per game     = " + getTouchDownsPerGame() +
            "\nInterceptions per game  = " + getInterceptionsPerGame())
        );
    }
}