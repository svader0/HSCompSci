#include <iostream>
#include <vector>
#include <iomanip>
using namespace std;

int leftSum = 0;
int rightSum = 0;

void sumDiagonals (vector<vector<int>> & arr) 
{
	for (int r = 0; r < arr.size(); r++)
	{
			leftSum += arr[r][r];
			rightSum += arr[r][(arr.size() - 1) - r];
	}
}

int main() {

	srand(time(NULL));
	int arr_size;

	std::cout << "Enter size of array --> ";
	std::cin >> arr_size;
	std::cout << "\n";

	vector<vector<int>> arr (arr_size, vector<int>(arr_size));
	
	for (int r = 0; r < arr.size(); r++)
	{
		for (int c = 0; c < arr[r].size(); c++)
		{
			arr[r][c] = static_cast<int>((rand() % 10));
			std::cout << arr[r][c] << " ";
		}
		std::cout << "\n";
	}

	std::cout << "\n\n";
	for (int i = 0; i < arr_size;i++) { std::cout << "- "; }
	std::cout << "\n\n";
    
	sumDiagonals(arr);

	std::cout << "Sum1: " << leftSum << "\n";
	std::cout << "Sum2: " << rightSum << "\n";

    return 0;
	
}