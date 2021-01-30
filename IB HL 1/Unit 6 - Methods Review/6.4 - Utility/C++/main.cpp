#include "Utility.h"

int main() {
	int iNum {Utility::readInt("Enter an integer --> ")};
    std::cout << "The number = " << iNum;

    Utility::blankLines(2);

    double dNum = Utility::readDouble("Enter a double --> ");
    std::cout << "The number = " << dNum;

    Utility::blankLines(2);

    string str = Utility::readString("Enter a string -->");
    std::cout << "The string = " << str;

    Utility::blankLines(2);
}