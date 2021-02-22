import java.util.*;

public class SeatingChart {
	// instance variables
	private Student[][] chart; // the seating chart
	private Scanner keyboard;
	private int numRows; // number of rows in chart
	private int numCols; // number of columns in chart

	// default constructor
	public SeatingChart(int rows, int cols) {
		chart = new Student[rows][cols];
		keyboard = new Scanner(System.in);
		numRows = rows;
		numCols = cols;

		initChart(chart);
	}

	// another constructor
	public SeatingChart(Student[][] array2D) {
		chart = array2D;
		keyboard = new Scanner(System.in);
		numRows = chart.length;
		numCols = chart[0].length;
	}

	/*
	 * This method populates array2D with default Student objects. A default
	 * Student, when displayed, prints the word "vacant".
	 */
	public void initChart(Student[][] array2D) {
		for (int r = 0; r < array2D.length; r++) {
			for (int c = 0; c < array2D[r].length; c++) {
				array2D[r][c] = new Student();
			}
		}
	}

	/*
	 * This method displays the seating chart on the console window.
	 */
	public void displayChart() {
		for (int r = 0; r < chart.length; r++) 
		{
			for (int c = 0; c < chart[r].length; c++) 
			{
				System.out.print("(" + r + "," + c + ") " + chart[r][c]);
			}
			System.out.println();
		}
	}

	/*
	 * This method adds a Student to the seating chart at the specified location. If
	 * the specified location is a valid location the Student is added to the chart
	 * and the method returns true; otherwise the Student is not added to the chart
	 * and the method returns false.
	 * 
	 * @param student the Student to be added to the seating chart
	 * 
	 * @param row the row location where Student should be added.
	 * 
	 * @param col the column location where Student should be added.
	 */
	public boolean addStudent(Student student, int row, int col) 
	{
		if (chart.length > row && chart[row].length > col)
		{
			if (chart[row][col].getName() == "vacant") {
				chart[row][col] = student;
				return true;
			}
			return false;
		}
		return false;
	}

	/*
	 * This method swaps seats of two Students in the seating chart. If both seat
	 * locations are valid the Students are swapped and the method returns true;
	 * otherwise the Students are not swapped and the method returns false.
	 * 
	 * @ row1, col1 location of first student
	 * 
	 * @ row2, col2 location of second student
	 */
	public boolean swapSeats(int row1, int col1, int row2, int col2) 
	{
		try 
		{
			Student student1 = chart[row1][col1];
			Student student2 = chart[row2][col2];

			chart[row1][col1] = student2;
			chart[row2][col2] = student1;
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			return false;
		}

		return true;
	}

	/*
	 * This method creates a new 2D array of Students by taking all the students
	 * from the seating chart and placing them in the new chart at random locations.
	 * Any seats not assigned to a student should be assigned a default Student
	 * object which, when displayed, will print the word "vacant".
	 * 
	 * @ return the new 2D array
	 */

	public Student[][] scrambleChart()
    {
        Student newChart[][] = chart;
        for(int r = 0; r< newChart.length; r++)
        {
            for(int c = 0; c< newChart[r].length; c++)
            {
                int randRow = (int)Math.random() * r+1;
                int randCol = (int)Math.random() * c+1;

                Student tempStudent = newChart[r][c];
                newChart[r][c] = newChart[randRow][randCol];
                newChart[randRow][randCol] = tempStudent;

            }
        }
            return newChart;

    }
}