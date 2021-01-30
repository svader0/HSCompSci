#include "vowels.hpp"

void Vowels::inputWords() 
{
	std::cout << "Enter 10 words:\n";
	for (int i = 0; i < 10; i++) 
	{
		std::cout << "Word " << (i + 1) << "--> ";
		std::cin >> m_arr[i];
	}
}

int Vowels::getVowels(std::string string) 
{
	int currentVowels{0};
	
	for (int i = 0; i < string.length(); i++)
	{
		if (string[i] == 'a' ||
		    string[i] == 'e' ||
			string[i] == 'i' ||
			string[i] == 'o' ||
			string[i] == 'u' )
		{
				currentVowels++;
		}
	}
	return currentVowels;
}

void Vowels::print() 
{
	std::cout << "\n\n\n\n";
	for (int i = 0; i < 10; i++) 
	{
		std::cout << std::uppercase << m_arr[i] << " vowel count --> " << getVowels(m_arr[i]) << std::endl; 
	}
}