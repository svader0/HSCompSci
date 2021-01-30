#include "numbers.hpp"
#include <iostream>
#include <ctime>

void Numbers::populateNums() {
	std::srand( time(NULL));
	for (int i = 0; i < numSize; i++) {
		nums[i] = ((std::rand() % 200) - 100);
	}
}

void Numbers::populatePositives() {
	for (int i = 0; i < numSize; i++) {
		if (nums[i] >= 0 ) 
		{
			positives[p] = nums[i];
			p++;
		}
	}
}

void Numbers::populateNegatives() {
	for (int i = 0; i < numSize; i++) {
		if (nums[i] < 0) 
		{
			negatives[n] = nums[i];
			n++;
		}
	} 
}

void Numbers::print(int (&arr)[20], const int size) {
	for (int i = 0; i < size; i++) 
	{
		std::cout << arr[i] << " ";
	}
}

void Numbers::printArrays() {
	std::cout << "\nnums\n=====================\n";
	
	print(nums, numSize);
	std::cout << "\n\n\npositives\n=====================\n";
	std::cout << "logical size: " << p << "\n";
	print(positives, p);
	
	std::cout << "\n\nnegatives\n=====================\n";
	std::cout << "logical size: " << n << "\n";
	print(negatives, n);
}