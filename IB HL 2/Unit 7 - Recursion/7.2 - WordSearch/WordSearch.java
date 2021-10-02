import java.util.*;
import java.io.*;

public class WordSearch 
{
	private String[][] puzzle; // word search puzzle

	public WordSearch() 
	{
		puzzle = readFile();

		printPuzzle();

		// search for the following words in puzzle

		String[] names = { "ada", "java", "fortran", "basic", "perl", "lisp", "algol", "pascal", "ruby", "javascript",
				"swift", "cobol", "assembly" };

		for (int i = 0; i < names.length; i++) 
		{
			if (searchPuzzle(names[i]))
				System.out.printf("%10s |%3s",names[i], " yes\n");
			else
				System.out.printf("%10s |%3s",names[i], " no\n");
		}
	}

	/*
	 * This method searchs the 2D array puzzle looking for a word. If the word is
	 * found it returns true; otherwise it returns false. param: word the string for
	 * which the method is searching (key) return: true or false
	 */
	public boolean searchPuzzle(String word) 
	{
		for (int r = 0; r < puzzle.length; r++) {
			for (int c = 0; c < puzzle[r].length; c++) {
				if (findWord(word, r, c, 0)) 
				{
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * This method recurively searches the puzzle array for a series of letters that
	 * matches the parameter word. Id a match is found the method returns a value of
	 * true; otherwise it returns false. The method searches for a pattern of
	 * letters positioned horizontally, vertically, or diagonally. the letters can
	 * be layed out in regular order or reverse order. param: word the string key
	 * param: r the starting row for the search param: c the starting column for the
	 * search param: index word's current letter beign searched or return : true or
	 * false
	 */
	public boolean findWord(String word, int r, int c, int index) 
	{
		if (inBounds(r, c) == false) {
			return false;
		}
		if (word.length() <= index) 
		{
			return true;
		}
		if (puzzle[r][c].equals(word.substring(index, index+1)))
		{
			return (findWord(word, r, c + 1, index + 1) 
					|| findWord(word, r, c - 1, index + 1)
					|| findWord(word, r + 1, c, index + 1) 
					|| findWord(word, r - 1, c, index + 1)
					|| findWord(word, r + 1, c + 1, index + 1)
					|| findWord(word, r - 1, c - 1, index + 1)
					|| findWord(word, r + 1, c - 1, index + 1) 
					|| findWord(word, r - 1, c + 1, index + 1));
		}
		return false;
	}

	// determines if the locations specified by the parameters r and c are
	// a valid location within the 2D array puzzle.
	public boolean inBounds(int r, int c) 
	{
		return r >= 0 && c >= 0 && r < puzzle.length && c < puzzle[r].length;
	}

	// prints the 2D array with a space between each letter
	public void printPuzzle()
	{
		for (int r = 0; r < puzzle.length; r++) {
			for (int c = 0; c < puzzle[r].length; c++) {
				System.out.print(puzzle[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	// returns a 2D array of String characters read from an external file
	public String[][] readFile() 
	{
		String[][] array2D = null;
		Scanner input = null;
		try {
			input = new Scanner(new File("puzzle.dat"));
			int rows = input.nextInt();
			int cols = input.nextInt();

			array2D = new String[rows][cols];

			for (int r = 0; r < rows; r++) {
				for (int c = 0; c < cols; c++) {
					array2D[r][c] = input.next();
				}
			}
		} catch (IOException e) 
		{
			System.out.println("Trouble reading file!");
		}

		return array2D;
	}

	public static void main(String[] args) 
	{
		WordSearch app = new WordSearch();
	}
}