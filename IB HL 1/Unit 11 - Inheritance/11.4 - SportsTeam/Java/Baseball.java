public class Baseball extends SportsTeam
{
	// instance variables

    private int numHomeRuns;
    private int numRBIs;
    private int numErrors;
	
	// default constructor
	public Baseball(String name)
	{
		super (name);
	}
	
	// second constructor
	public Baseball(String name, int gamesPlayed, int gamesWon, int gamesLost, int h, int r, int e)
	{
		super(name, gamesPlayed, gamesWon, gamesLost);
        numHomeRuns = h;
        numRBIs = r;
        numErrors = e;
	}
	
	// accessor method - getHomeRunsPerGame
	// calculates and returns the homeruns per game by
	// dividing number of homeruns by games played
	public double getHomeRunsPerGame()
	{
		return (double)((double)numHomeRuns / (double)super.getGamesPlayed());
	}
	
	// accessor method - getRBIsPerGame
	// calculates and returns the RBIs per game by
	// dividing the number of RBIs by games played
	public double getRBIsPerGame()
	{
		return ((double)numRBIs / (double)super.getGamesPlayed());
	}
	
	// accessor method - getErrorsPerGame
	// calculates and returns the errors per game by
	// dividing the number of errors by games played
	public double getErrorsPerGame()
	{
		return ((double)numErrors / (double)super.getGamesPlayed());
	}
	
	// toString method
	public String toString()
	{
        return (
            new String(super.toString() + 
            "\nHomeruns               = " + numHomeRuns +
            "\nRBIs                   = " + numRBIs +
            "\nErrors                 = " + numErrors +
            "\nHomeruns per game      = " + getHomeRunsPerGame() +
            "\nRBIs per game          = " + getRBIsPerGame() +
            "\nErrors per game        = " + getErrorsPerGame())
        );
	}
}