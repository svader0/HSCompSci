#include "Utility.h"
#include <iomanip>

string name;
int correct, incorrect;

void getInputs() {
	name = Utility::readString("Enter contestant's name --> ");
	correct = Utility::readInt("# Correct --> ");
	incorrect = Utility::readInt("# Incorrect --> ");
}

void outputScores() {
	std::cout << std::setfill('-') << std::right << std::setw(18) << "Contestant name : " << name << std::endl
		                                         << std::setw(18) << "# Correct : " << correct << std::endl
		                                         << std::setw(18) << "# Incorrect : " << incorrect << std::endl << std::flush;
}

int main() {
	getInputs();
	outputScores();
	Utility::blankLines(4);

	return 0;
}