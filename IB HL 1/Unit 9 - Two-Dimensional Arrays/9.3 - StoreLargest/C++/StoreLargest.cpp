#include <iostream>
#include <array>
#include <iomanip>

using namespace std;

/*
	Takes in a reference to an array and then prints it out line by line.
	@param Array to print
*/
void printArr(array<array<int, 4>, 4> & arr)
{
	for (array<int, 4> nums : arr)
	{
		cout << "------------\n";
		for (int c : nums)
		{
			cout << setw(2) << c << "|";
		}
		cout << endl;
	}
	cout << "------------\n";
}

/*
	Fills an array with random numbers 1-9
	@param Array to fill
*/
void fillArr(array<array<int, 4>, 4> & arr)
{
	for (int r = 0; r < arr.size(); r++)
	{
		for (int c = 0; c < arr[r].size(); c++)
		{
			arr[r][c] = static_cast<int>(rand() % 9);
		}
	}
}

/*
	Compares two arrays and edits array 1 with the largest values
	@param array that WILL BE CHANGED
	@param array to reference
*/
void compareArrays( // takes two array references, edits content of array1
	array<array<int, 4>, 4> & arr1,
	array<array<int, 4>, 4> & arr2
	)
{
	for (int r = 0; r < arr1.size(); r++)
	{
		for (int c = 0; c < arr1[r].size(); c++)
		{
			if (arr1[r][c] < arr2[r][c])
			{
				arr1[r][c] = arr2[r][c];
			}
		}
	}
}

int main() 
{
	srand(time(NULL));
	array<array<int, 4>, 4> arr1{0};
	array<array<int, 4>, 4> arr2{0};

	cout << "\n -- Matrix 1 --\n\n";

	fillArr(arr1);
	printArr(arr1);

	cout << "\n -- Matrix 2 --\n\n";

	fillArr(arr2);
	printArr(arr2);

	compareArrays(arr1, arr2);

	cout << "\n -- Largest Elements --\n\n";

	printArr(arr1);
	
}