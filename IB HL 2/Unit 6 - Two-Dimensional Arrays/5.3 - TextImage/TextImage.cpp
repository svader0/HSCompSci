#include <iostream>
#include <vector>
#include <fstream>
#include <string>

using std::vector;

void displayImage(vector<vector<int>> & img);
void displayUpsideDown(vector<vector<int>> & img);
void enlarge(vector<vector<int>> & img);
void readFile(vector<vector<int>> & img);

int main()
{
    vector<vector<int>> image (14, vector<int>(15));
    readFile(image);
    std::cout << "---------------------------\n";
    std::cout << "   Test displayImage\n";
    std::cout << "---------------------------\n";
    displayImage(image);
    std::cout;
    std::cout << "---------------------------\n";
    std::cout << "   Test displayUpsideDown\n";
    std::cout << "---------------------------\n";
    displayUpsideDown(image);
    std::cout;
    std::cout << "---------------------------\n";
    std::cout << "   Test enlarge\n";
    std::cout << "---------------------------\n";
    enlarge(image);
}

/* Precondition: array2D.length > 0 and array2D[0].length > 0
* Postcondition: displays a text image on the console window by
*   traversing array2D in row/column order. Each cell of array2D
*   contains a number between 1 and 3 inclusive. If a cell contains
*   a 1 the method displays "@ " on the screen. If a cell contains
*   a 2 the method displays "+ " on the screen. If a cell contains
*   a 3 the method displays "  " on the screen.
*/

void displayImage(vector<vector<int>> & img)
{
    for(int r = 0; r < img.size(); r++)
    {
        for(int c = 0; c < img.at(r).size(); c++)
        {
            if (img[r][c] == 1)
                std::cout << "@ ";
            if (img[r][c] == 2)
                std::cout << "+ ";
            if (img[r][c] == 3)
                std::cout << "  ";
        }
        std::cout << "\n";
    }
}

/* Precondition: array2D.length > 0 and array2D[0].length > 0
* Postcondition: displays the text image upside down.
*/

void displayUpsideDown(vector<vector<int>> & img)
{
    for(int r = img.size() - 1; r >= 0; r--)
    {
        for(int c = 0; c < img.at(r).size(); c++)
        {
            if (img[r][c] == 1)
                std::cout << "@ ";
            if (img[r][c] == 2)
                std::cout << "+ ";
            if (img[r][c] == 3)
                std::cout << "  ";
        }
        std::cout << "\n";
    }
}

/* Precondition: array2D.length > 0 and array2D[0].length > 0
* Postcondition: displays the text image twice the size of the
*   original image. This is accomplished by displaying each row
*   and column twice.
*/

void enlarge(vector<vector<int>> & img)
{
    for(int r = 0; r < img.size(); r++)
    {   
        std::string line;
        for(int c = 0; c < img.at(r).size(); c++)
        {
            if (img[r][c] == 1)
                line.append( "@ @ ");
            if (img[r][c] == 2)
                line.append( "+ + ");
            if (img[r][c] == 3)
                line.append( "    ");
        }
        std::cout << line << "\n";
        std::cout << line << "\n";
    }
}

/*
* This method reads numbers from a data file and stores
*   them in array2D.
*/

void readFile(vector<vector<int>> & img)
{
    std::ifstream inFile;
    inFile.open(".\\datafile.txt");
    if (!inFile.is_open()) 
    {
        std::cout << "File not found";
    }

    for(int r = 0; r < img.size(); r++)
    {
        for(int c = 0; c < img.at(r).size(); c++)
        {
            inFile >> img[r][c];
        }
    }
}