#include <iostream>
#include <string>

class Vowels 
{
private:

	std::string m_arr[10];
public:

	void inputWords();
	int getVowels(std::string string);
	void print();

};