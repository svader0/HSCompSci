#include <iostream>

int main() {
	std::cout << 5 << " + " << 10 << " = " << (5+10);
	std::cout << 30 << " / " << 5 << " = " << (30/5);	
	std::cout << 50 << " + " << 20 << " - " << 6 << " * " << 3 << " = " << (50 + 20 - 6*3);
	std::cout << 40 << " / " << "(3 + 5)" << " * 2 = " << (40/(3+5)*2) << "\n";
   	std::cout << "The remainder when you divide 15 by 4 is " << (15 % 4) << "\n";
   	std::cout << "Jack had 3 pencils and Jill had 5. \n Jack and Jill had " << (3 + 5) << " pencils.";
}