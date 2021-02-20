#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;
int numRows{}, numCols{};

int sumRow(vector<int> & arr) 
{
	int sum{};
	for (int i : arr) 
	{
		sum += i;
	}
	return sum;
}

int sumCols(vector<vector<int>> & arr, int currentCol) 
{
	int sum{};
	for (int i = 0; i < arr.size(); i++) 
	{
		sum += arr[i][currentCol];
	}
	return sum;
}

void printMatrix(vector<vector<int>> & arr) // prints using reference to vector arr
{
	for (int r = 0; r < arr.size(); r++) 
	{
		cout << "\n| ";
		for (int c = 0; c < arr[r].size(); c++) 
		{
			cout << setw(5) << arr[r][c] << " | ";
		}
		cout << "   :   " << sumRow(arr[r]);
	}
	cout << "\n\n\n";
	for (int i = 0; i < arr[0].size(); i++)
	{
		cout << setw(8) << sumCols(arr, i);
	}
}

void populateMatrix(vector<vector<int>> & arr) 
{
	for (int r = 0; r < arr.size(); r++)
	{
		for (int c = 0; c < arr[r].size(); c++)
		{
			arr[r][c] = static_cast<int>((rand() % 9));
		}
	}
}


int main() {
	
	srand(time(NULL));

	// gather input
	std::cout << "\nEnter number of rows --> ";
	std::cin >> numRows;
	std::cout << "\n\nEnter number of columns -->";
	std::cin >> numCols;
	
	std::vector<std::vector<int>> matrix(numRows, vector<int>(numCols));
	populateMatrix(matrix);
	std::cout << "\n\n == Print Matrix == \n";
	printMatrix(matrix);

	std::cout << "\n\n\n";
}