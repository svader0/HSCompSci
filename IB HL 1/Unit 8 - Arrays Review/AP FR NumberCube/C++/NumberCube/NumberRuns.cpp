#include "NumberCube.h"

#include <vector>
#include <time.h>
#include <iostream>
#include <iomanip>

using namespace std;


struct NumberRuns
{

    // Part (a) 
    /** Returns an array of the values obtained by tossing a number cube numTosses times.
    * @param cube -  a NumberCube (ref)
    * @param numTosses - the number of tosses to be recorded
    * Precondition: numTosses > 0
    * @return an array of numTosses values
    */
    static vector<int> getCubeTosses(NumberCube& cube, int numTosses)
    {
        vector<int> buffer;
        for (int i = 0; i < numTosses; i++)
        {
            buffer.push_back(cube.toss());
        }
        return buffer;
    }

    // Part (b)
    /** Returns the starting index of a longest run of two or more consecutive repeated values
    * in the array values.
    * @param values an array of integer values representing a series of number cube tosses
    * Precondition: values.length > 0
    * @return the starting index of a run of maximum size;
    * -1 if there is no run
    */
    static int getLongestRun(vector<int> values)
    {
        int_fast16_t startIndex{ -1 };
        int_fast16_t longestRun{ 1 };
        int_fast16_t currentRun{ 1 };

        for (int i = 1; i < values.size(); i++)
        {
            if (values[i] == values[i - 1])
            {
                currentRun++;
                if (currentRun > longestRun)
                {
                    longestRun = currentRun;
                    startIndex = i - currentRun;
                }
            }
            else { currentRun = 0; }
        }
        return startIndex;
    }

    void print(vector<int> arr)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            std::cout << setw(3) << i;
        }
        std::cout << "\n";
        for (int n : arr)
        {
            std::cout << ("---");
        }
        std::cout << "\n";

        for (int n : arr)
        {
            std::cout << setw(3) << n;
        }
        std::cout << "\n\n";
        std::cout << "Index of Longest Run = " << getLongestRun(arr);
        std::cout << "\n\n\n";
    }
};

int main ()
{
    
    srand(time(NULL)); // set seed for random numbers to the current time :)
    NumberRuns app;
    NumberCube cube1, cube2, cube3;

    vector<int> toss1 = app.getCubeTosses(cube1, 17);
    app.print(toss1);

    vector<int> toss2 = app.getCubeTosses(cube2, 17);
    app.print(toss2);

    vector<int> toss3 = app.getCubeTosses(cube3, 17);
    app.print(toss3);

    vector<int> toss4 = { 1,3,2,4,6,5,1,3,2,4,6,5,1,3,2,4 };
    app.print(toss4);
}

