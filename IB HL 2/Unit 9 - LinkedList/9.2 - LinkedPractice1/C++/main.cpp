#include <iostream>
#include <vector>
#include "node.h"
#include <stdlib.h>

Node* head;

void createList() 
{
	Node* temp = nullptr;
	Node* result;
	for(int i=0; i<10; i++)
	{
    	result = new Node(((rand() % 50) + 1), temp);
    	temp = result;
	}
	head = result;
}

void printList()
{
	Node* currNode = head;
	while(currNode->getNext() != nullptr) 
	{
		std::cout << (currNode->getValue()) << std::endl;
		currNode = currNode->getNext();
	}
}

// returns the sum of the numbers in the linked list referenced by head.
void sumList()
{
	int sum{0};
	Node* currNode = head;
	while (currNode->getNext() != nullptr) 
	{
		sum += currNode->getValue();
		currNode = currNode->getNext();
	}
	std::cout << "\nSUM: " << sum << std::endl;
}

// Displays the numbers in head that are greater than or equal to 25.
void filterList()
{
	std::cout << std::endl;
	Node* currNode = head;
	while (currNode->getNext() != nullptr) 
	{
		
		if (currNode->getValue() >= 25) 
		{
			std::cout << currNode->getValue() << " ";
		}
		currNode = currNode->getNext();
	}
	
}

int main() 
{
	srand(time(NULL)); // init random seed or whatever
	createList();
	printList();
	sumList();
	filterList();
}