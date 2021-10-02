#include <iostream>
#include <string>

// obviously there's printf arguments to just simply display a number as its binary equivalent,
// but completing the assignment with recursion is basically the whole point of the unit.

void toBinary(int n)
{
    if (n == 0) {
        std::cout << 0;
        return;
    }

    toBinary(n / 2);
    std::cout << (n % 2);
}

int main() 
{
    int num;
    std::cout << "Enter a number --> ";
    std::cin >> num;
    toBinary(num);
    return 0;
}