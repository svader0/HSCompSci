#include <iostream>
#include <string>

// obviously there's printf arguments to just simply display a number as its binary equivalent,
// but completing the assignment with recursion is basically the whole point of the unit.

std::string toBinary(int n)
{
    int res = (n % 2);
    std::string bin;
    if (res == 0) 
    {
        return bin;
    }
    else
    {
        bin.append(std::to_string(res));
        toBinary(res);
    }
}

int main() 
{
    int num;
    std::cout << "Enter a number --> ";
    std::cin >> num;
    std::cout << "\n\nBinary = " << toBinary(num);
    return 0;
}