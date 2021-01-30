#include "Utility.h"

int Utility::readInt(string prompt) {
	string input;
	std::cout << prompt;
	std::cin >> input;
	std::cout << std::endl;
	return stoi(input);
}
double Utility::readDouble(string prompt) {
	string input;
	std::cout << prompt;
	std::cin >> input;
	std::cout << std::endl;

	return stod(input);
}
string Utility::readString(string prompt) {
	std::cin.ignore();
	char input[50] = {};
	std::cout << prompt;
	std::cin.getline(input, 50);
	std::cout << std::endl;
	
	return input;
}

void Utility::blankLines(int num) {
	for (int i{0}; i <= num; i++) {
		std::cout << std::endl;
	}
}
