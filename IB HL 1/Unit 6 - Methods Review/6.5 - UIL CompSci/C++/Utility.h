#include <string>
#include <iostream>

#ifndef UTILITY
#define UTILITY

using std::string;

class Utility {

public:
	static int readInt(string prompt);
	static double readDouble(string prompt);
	static string readString(string prompt);
	static void blankLines(int num);
};

#endif