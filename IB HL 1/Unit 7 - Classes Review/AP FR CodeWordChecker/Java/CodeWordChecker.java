class CodeWordChecker {
	int min, max;
	String phrase;

	CodeWordChecker(int min, int max, String phrase) 
	{
		this.min = min;
		this.max = max;
		this.phrase = phrase;
	}
	CodeWordChecker(String phrase) 
	{
		min = 6;
		max = 20;
		this.phrase = phrase;
	}

	public boolean isValid (String code) 
	{
		if (code.length() < min || code.length() > max || code.contains(phrase)) 
		{
			return false;
		}

		return true;
	}
}