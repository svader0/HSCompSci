#include <iostream>
#include <iomanip>
#include <vector>

using std::vector;

void printMatrix (vector<vector<int>> & arr);

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

    return 0;
}



void printMatrix (vector<vector<int>> & arr) 
{
    /*
        Simple method for print formatting... there's probably a library 
        to do this but I don't feel like looking that up right now.
    */
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