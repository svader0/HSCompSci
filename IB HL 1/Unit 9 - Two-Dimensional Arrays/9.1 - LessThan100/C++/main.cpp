#include <iostream>
#include <time.h>
#include <vector>
#include <iomanip>

using std::vector;

void printMatrix(vector<vector<int>> &matrix);


int main() {
	srand(time(NULL));
	// get user input -------------------------------------------

	int row{0}, columns{0};
	std::cout << "\nEnter number of rows --> ";
	std::cin >> row;
	std::cout << "\nEnter number of columns --> ";
	std::cin >> columns;
	
	// declare new vector matrix with type 'int' and size of row and columns.
	vector<vector<int>> matrix(row, vector<int>(columns));


	// populate array with random numbers ----------------------
	for (int r = 0; r < matrix.size(); r++) 
	{
		for (int c = 0; c < matrix[r].size(); c++) 
		{
			matrix[r][c] = static_cast<int>((rand() % 200) + 1);
		}
	}

	// output the matrix as text (see bottom of file)
	printMatrix(matrix); 

	// find out which ones are less than 100 and print them ---
	std::cout << "\n\nNumbers less than 100:\n\n";
	std::cout << "row:            column:\n";
	for (int r = 0; r < matrix.size(); r++) 
	{
		for (int c = 0; c < matrix[r].size(); c++) 
		{
			if (matrix[r][c] < 100) 
			{
				std::cout << r << std::setw(16) << c << std::endl;
			}
		}
	}


	std::cout << "\n\n\n\nFinished!\n";
	return 0;
}

void printMatrix(vector<vector<int>> &matrix) // prints using reference to vector arr
{
	for (int r = 0; r < matrix.size(); r++) 
	{
		std::cout << "\n| ";
		for (int c = 0; c < matrix[r].size(); c++) 
		{
			std::cout << std::setw(5) << matrix[r][c] << " | ";
		}
	}
	std::cout << "\n";
}
