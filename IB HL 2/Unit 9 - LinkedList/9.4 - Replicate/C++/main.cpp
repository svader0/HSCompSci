#include <iostream>
#include <cassert>
#include "include/node.hpp"

Node* head = nullptr;

void deleteList() 
{
	if (head) {
		Node* temp1 = head->getNext();
		while(temp1!=NULL)
		{   
			head->setNext(temp1->getNext());
			temp1->setNext(nullptr);
			delete (temp1);
			temp1 = head->getNext();
		}
	}
}

void buildList()
{	
	deleteList();
    Node* node2 = new Node("blue", nullptr);
    Node* node1 = new Node("white", node2);
    head = new Node("red", node1);
}

void printList()
{
    Node* cur = head;
    while(cur != nullptr)
    {
        std::cout << (cur->getValue() + " ") << std::endl;
        cur = cur->getNext();
    }
    std::cout << std::endl;
}

void replicate(int n)
{
	assert(n >= 2);
	Node* temp = nullptr;
	Node* result;
	Node* cur = head;
	while (cur)
	{
		for(int i=0; i<n + 1; i++)
		{
			result = new Node(cur->getValue(), temp);
			temp = result;
		}
		cur = cur->getNext();
	}
	
	deleteList();
	head = result;
}

int main() 
{
	buildList();
    printList();
    replicate(2);
    printList();
    buildList();
    replicate(3);
    printList();
} 