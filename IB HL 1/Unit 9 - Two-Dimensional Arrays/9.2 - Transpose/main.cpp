#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;
int numRows{}, numCols{};

void printMatrix(vector<vector<int>> & arr) // prints using reference to vector arr
{
	for (int r = 0; r < arr.size(); r++) 
	{
		std::cout << "\n| ";
		for (int c = 0; c < arr[r].size(); c++) 
		{
			std::cout << std::setw(5) << arr[r][c] << " | ";
		}
	}
	std::cout << "\n";
}

void populateMatrix(vector<vector<int>> & arr) 
{
	for (int r = 0; r < arr.size(); r++)
	{
		for (int c = 0; c < arr[r].size(); c++)
		{
			arr[r][c] = static_cast<int>((rand() % 200) - 100);
		}
	}
}

vector<vector<int>> transposeMatrix(vector<vector<int>> & arr) 
{
	std::vector<std::vector<int>> buffer(numCols, vector<int>(numRows));

	for (int r = 0; r < buffer.size(); r++)
	{
		for (int c = 0; c < buffer[r].size(); c++)
		{
			buffer[r][c] = arr[c][r];
			
		}
	}
	return buffer;
}

int main() {

	srand(time(NULL));

	// gather input
	std::cout << "\nEnter number of rows --> ";
	std::cin >> numRows;
	std::cout << "\n\nEnter number of columns -->";
	std::cin >> numCols;
	
	std::vector<std::vector<int>> arr(numRows, vector<int>(numCols));

	populateMatrix(arr);
	std::cout << "\n\n == Original Matrix == \n";
	printMatrix(arr);

	arr = transposeMatrix(arr);
	std::cout << "\n\n == Transposed Matrix == \n";
	printMatrix(arr);

}