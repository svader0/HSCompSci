#include <iostream>
#include "numbers.hpp"

int main() {
	Numbers app;
	
	app.populateNums();
	app.populatePositives();
	app.populateNegatives();
	app.printArrays();
}