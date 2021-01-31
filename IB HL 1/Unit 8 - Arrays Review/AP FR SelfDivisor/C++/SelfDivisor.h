#include <iostream>
#include <string>
#include <vector>
#include <assert.h>


class SelfDivisor
{

public:

    //***********
    // Part (a)
    //***********
    /** @param number the number to be tested
     *         Precondition: number > 0
     *  @return true if every decimal digit of number is a divisor of number;
     *         false otherwise
     */

    static bool isSelfDivisor(int number)
    {
        assert(number > 0);
        int inputNum = number;
        int digit;
        while (number != 0)
        {
            digit = (number % 10);
            number /= 10;
            if (digit == 0) { return false; }
            if (inputNum % digit != 0) { return false; }
        }
        return true;
    }

    //************
    // Part (b)
    //************
    /** @param start starting point for values to be checked
     *         Precondition: start > 0
     *  @param num the size of the array to be returned
     *         Precondition: num > 0
     *  @return an array containing the first num integers >= start that are self-divisors
     */
    static std::vector<int> firstNumSelfDivisors(int start, int num)
    {
        std::vector<int> values;
        for (int i = start; values.size() < num; i++)
        {
            if (isSelfDivisor(i))
            {
                values.push_back(i);
            }
        }
        return values;
    }

    // There may be fields, constructors, and methods that are not shown.


    static void print(std::vector<int> list) // accept a vector object 'list'
    {
        for (int n : list) // iterate through vector
        {
            std::cout << n << " "; // print them all out one by one
        }
        std::cout << "\n\n"; // skip a few lines
    }
};