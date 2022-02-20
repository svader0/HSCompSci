#include <iostream>
#include <random>
#include "node.hpp"
	
Node* removeFirstNode(Node* head)
{
	Node* temp = head->getNext();
	delete head;
	return temp;
}
    
// removes the last node in the linked list referenced by head
// returns head
	
void removeLastNode(Node* head)
{
	Node* currNode = head;
	Node* nextNode = currNode->getNext();
	while (nextNode != nullptr) 
	{
		currNode = currNode->getNext();
		nextNode = currNode->getNext()->getNext();
	}
	currNode->setNext(nullptr);
	delete currNode->getNext();
}
    
// adds a new ListNode object with a value of num at the beginning of 
// the linked\ list referenced by head; returns head

Node* addFirstNode(Node* head, int num)
{
	Node* newNode = new Node(num, head);
	return newNode;
}
    
// adds a new ListNode object with a value of num at the end of the 
// linked list referenced by head; returns head

void addLastNode(Node* head, int num) 
{
    Node* cur = head;
    while(cur->getNext() != nullptr)
    {
        cur = cur->getNext();
    }
	cur->setNext(new Node(0, nullptr));
	cur->setValue(num);
}

// inserts a new ListNode object with a value of num into the linked list
// referenced by head before the nth node in the list; returns head

void insertNode(Node* head, int num, int nth)
{
	Node* currNode = head;
	for (int i = 1; i<nth; i++)
	{
		currNode = currNode->getNext();
	}
	Node* temp = new Node();
	temp->setValue(num);
	temp->setNext(currNode->getNext());
	currNode->setNext(temp);
}

Node* createList()
{
    Node* temp = nullptr;
	Node* result;
	for(int i=0; i<20; i++)
	{
   		result = new Node;
   		result->setValue((rand() % 50) + 1);
   		result->setNext(temp);
   		temp = result;
	}
	return result;
}
    
void printList(Node* head)
{
    std::cout << ("List: ");
	Node* cur = head;
    while(cur->getNext() != nullptr)
    {
        std::cout << cur->getValue() << " ";
        cur = cur->getNext();
    }
    std::cout << std::endl;
}

void deleteList(Node* head)
{
	Node* cur = head;
    Node* prev = head;
 
    while (cur->getNext() != nullptr)
    {
        cur = cur->getNext();
        delete (prev);
        prev = cur;
    }
}

int main() {
	Node* head = nullptr;
	srand(time(NULL));
    std::cout << ("\n-----------------------");
    std::cout << ("    removeFirstNode    ");
	std::cout << ("-----------------------\n");
	head = createList();            // create linked list
	
    printList(head);                // print linked list
    head = removeFirstNode(head);
    printList(head);
	deleteList(head);
        
    std::cout << ("\n-----------------------");
    std::cout << ("    removeLastNode    ");
    std::cout << ("-----------------------\n");
    head = createList();            // create linked list
    printList(head);                // print linked list
    removeLastNode(head);
    printList(head);
        
	deleteList(head);

    std::cout << ("\n-----------------------");
    std::cout << ("     addFirstNode    ");
    std::cout << ("-----------------------\n");
    head = createList();            // create linked list
    printList(head);                // print linked list
	head = addFirstNode(head, 1000);
    printList(head);
	deleteList(head);
        
    std::cout << ("\n-----------------------");
    std::cout << ("      addLastNode    ");
    std::cout << ("-----------------------\n");
    head = createList();            // create linked list
    printList(head);                // print linked list
	addLastNode(head, 1000);
    printList(head);

	deleteList(head);
        
    std::cout << ("\n-----------------------");
    std::cout << ("       insertNode     ");
    std::cout << ("-----------------------\n");
    head = createList();            // create linked list
    printList(head);                // print linked list
    insertNode(head, 1000, 9);
    printList(head);
    std::cout << std::endl;

}