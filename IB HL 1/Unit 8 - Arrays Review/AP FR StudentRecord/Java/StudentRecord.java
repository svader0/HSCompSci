public class StudentRecord 
{
	private int[] scores; // contains scores.length values
							// scores.length > 1

	// constructor
	public StudentRecord(int[] s) 
	{
		scores = s;
	}

	// returns the average (arithmetic mean) of the values in scores
	// whose subscripts are between first and last, inclusive
	// precondition: 0 <= first <= last < scores.length
	private double average(int first, int last) 
	{
		double n = 0;
		for (int i = first; i < last; i++) 
		{
			n += scores[i];
		}
		return (n / (last - first));
	}

	// returns true if each successive value in scores is greater
	// than or equal to the previous value;
	// otherwise, returns false
	private boolean hasImproved() 
	{
		for (int i = 0 ; i < scores.length; i++) 
		{
			if (i != 0) // if it's not the first loop
			{
				if (scores[i] < scores[i - 1]) { // check if this score is less than the last one
				//                                  if it is, return false.
					return false; 
				}
			}
		}
		return true;
	}

	// if the values in scores have improved, returns the average
	// of the elements in scores with indexes greater than or equal
	// to scores.length/2;
	// otherwise, returns the average of all of the values in scores
	public double finalAverage() 
	{
		if (hasImproved() == true)
		{
			double totalScores = 0;
			double numScores = 0;
			for (int i = 0; i < scores.length; i++)
			{
				if (i >= (scores.length / 2))
				{
					totalScores += scores[i];
					numScores++;
				}
			}
			return (totalScores / numScores);
		}	
		else 
		{
			return average(0, scores.length);
		}
	}
}