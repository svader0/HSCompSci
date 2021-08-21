#include <iostream>
#include <iomanip>
#include <vector>

using std::vector;

void printMatrix (vector<vector<int>> arr);
void flipHorizontally (vector<vector<int>> & arr);
void flipVertically (vector<vector<int>> & arr);

int main () 
{
    srand(time(NULL));
    int arr_size;

	std::cout << "Enter size of array --> ";
	std::cin >> arr_size;
	std::cout << "\n\n";

    vector<vector<int>> arr (arr_size, vector<int>(arr_size));
    // populate array   \/ \/ \/ \/ \/ \/ \/ \/ \/ \/
    for (int r = 0; r < arr.size(); r++) 
    {
        for (int c = 0; c < arr.at(r).size(); c++) 
        {
            arr[r][c] = static_cast<int>(rand() % 10);
        }
    }

    
	printMatrix(arr);
    std::cout << "\n<---------------- Flip Horizontally ---------------->\n\n";
    flipVertically(arr);
    printMatrix(arr);
    std::cout << "\n<----------------- Flip Vertically ----------------->\n\n";
	flipHorizontally(arr);
    printMatrix(arr);

    return 0;
}

void flipHorizontally (vector<vector<int>> & arr) 
{
	vector<vector<int>> buffer (arr.size(), vector<int>(arr.size()));

    for (int r = 0; r < arr.size(); r++) 
    {
        for (int c = 0; c < arr.at(r).size(); c++) 
        {
            buffer[r][c] = arr[r][arr.size() - c - 1];
        }
    }
    arr = buffer;
	
}

void flipVertically (vector<vector<int>> & arr) 
{
	vector<vector<int>> buffer (arr.size(), vector<int>(arr.size()));

    for (int r = 0; r < arr.size(); r++) 
    {
        for (int c = 0; c < arr.at(r).size(); c++) 
        {
            buffer[r][c] = arr[arr.size() - r - 1][c];
        }
    }
    arr = buffer;
	
}


void printMatrix (vector<vector<int>> arr) 
{
    for (int i = 0; i < arr.size() * 4; i++) {std::cout << "-";} // top bar

    std::cout << "-\n";
    for (int r = 0; r < arr.size(); r++) 
    {
        std::cout << "| ";
        for (int c = 0; c < arr.at(r).size(); c++) 
        {
            std::cout << arr[r][c] << " | ";
        }
        std::cout << " \n";
    }

    for (int i = 0; i < arr.size() * 4; i++) {std::cout << "-";} // bottom bar
    std::cout << "-\n";
}