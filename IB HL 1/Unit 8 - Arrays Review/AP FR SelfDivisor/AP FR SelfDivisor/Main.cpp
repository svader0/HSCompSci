#include "SelfDivisor.h"
using std::cout;

int main()
{
    // Test isSelfDivisor
    int num = 128;
    cout << "\n\n";
    if (SelfDivisor::isSelfDivisor(num))
    {
        cout << num << " is a self-divisor.\n";
    }
    else
    {
        cout << num << " is not a self-divisor.\n";
    }

    num = 26;
    if (SelfDivisor::isSelfDivisor(num))
    {
        cout << num << " is a self-divisor.\n";
    }
    else
    {
        cout << num << " is not a self-divisor.\n";
    }

    num = 420;
    if (SelfDivisor::isSelfDivisor(num))
    {
        cout << num << " is a self-divisor.\n";
    }
    else
    {
        cout << num << " is not a self-divisor.\n";
    }

    // Test firsNumSelfDivisors
    cout << "\n\n"; // blank line x2
    std::vector<int> list = SelfDivisor::firstNumSelfDivisors(20, 5);
    cout << ("firstNumSelfDivisors(20, 5)-->");
    SelfDivisor::print(list);
    list = SelfDivisor::firstNumSelfDivisors(500, 10);
    cout << ("firstNumSelfDivisors(500, 10)-->");
    SelfDivisor::print(list);
    cout << std::endl;
}