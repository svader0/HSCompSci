#include "include/node.hpp"
#include <iostream>
#include <cstdio>

Node* head = nullptr;

void printList()
{
    Node* cur = head->getNext();
    while(cur != nullptr)
    {
        std::cout << cur->getValue() << " ";
        cur = cur->getNext();
    }
    std::cout << std::endl;
}

void buildList()
{
    head = new Node((rand() % 20), nullptr);
    for(int i = 0; i < 20; i++)
    {
        head = new Node(rand() % 20, head);
    }
}

void remove()
{
	Node* dummy = new Node(0, head);
	head = dummy;
	Node* cur = head->getNext();
	Node* last = head;
	
	while (cur != nullptr)
	{

		if ((cur->getValue() % 2) != 0)
		{
			Node* temp = cur;
			last->setNext(cur->getNext());
			cur = cur->getNext();
			delete temp; // free old node from memory
		}
		else 
		{
			last = cur;
			cur = cur->getNext();
		}

	}
}

int main()
{
	srand(time(NULL));
	buildList();
    printList();
    remove();
    printList();
}