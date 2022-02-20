#include <iostream>
#include <algorithm>
#include <vector>
#include "include/node.hpp"

Node* head;
std::vector<int> list1 = {1,3,2,6,4,1,5,2,2,4,8,1,9,9};
std::vector<int> list2 = {1,2,3,4,5,6,7,8,9,9};
std::vector<int> list3 = {1,2,3,4,5,6,7,8,9};
std::vector<int> list4 = {1,1,2,3,4,4,4,5,6,7,8,8,9};

Node* buildList(std::vector<int> &list)
    {
        Node* start = new Node(list.at(0), nullptr);
        Node* cur = start;
        for(int i = 1; i < list.size(); i++)
        {
           Node* newNode = new Node(list.at(i),nullptr);
           cur->setNext(newNode);
           cur = newNode;
        }
        return start;
    }

void printList(Node* cur)
{
    if(cur != nullptr)
    {
        std::cout << cur->getValue() << " ";
        printList(cur->getNext());  // recursive call
    }
    else
        std::cout << "\n";
}

// Precondition:  cur points to the beginning of a list
// Postcondition: returns true if and only if list has duplicates
bool hasDuplicates(Node* cur)
{
	std::vector<int> dups;
	while (cur)
	{
		// count is from <algorithm>
		if (std::count(dups.begin(), dups.end(), cur->getValue())) 
		{
			return true;
		}
		dups.push_back(cur->getValue());
		cur = cur->getNext();
	}
	return false;
}

// Precondition:  cur points to the beginning of a list
// Postcondition: removes all duplicate items from the list pointed to by cur
void removeDuplicates(Node* cur)
{
	Node* prev = new Node(0, cur);
	Node* dummy = prev; // save address of dummy header so i can delete it later
	std::vector<int> dups;
	while (cur)
	{
		if (std::count(dups.begin(), dups.end(), cur->getValue())) 
		{
			Node* temp = cur;
			prev->setNext(cur->getNext());
			cur = cur->getNext();
			delete temp;
		}
		else 
		{
			prev = cur;
			dups.push_back(cur->getValue());
			cur = cur->getNext();
		}
	}
	delete dummy;
}

int main() 
{
	std::cout << ("\nTest hasDuplicates\n");
    std::cout << ("==================\n");

    head = buildList(list1);
    printList(head);

    if(hasDuplicates(head)==true)
        std::cout << ("List1 contains duplicates");
    else
        std::cout << ("List1 does not contain duplicates");

    std::cout << std::endl;

    head = buildList(list2);
    printList(head);

       if(hasDuplicates(head)==true)
          std::cout << ("List2 contains duplicates");
       else
          std::cout << ("List2 does not contain duplicates");
       std::cout << std::endl;

       head = buildList(list3);
       printList(head);

       if(hasDuplicates(head)==true)
          std::cout << ("List3 contains duplicates");
       else
          std::cout << ("List3 does not contain duplicates");
       std::cout << std::endl;

       // Test removeDuplicates Method
       std::cout << ("\nTest removeDuplicates\n");
       std::cout << ("==================\n");

       head = buildList(list1);
       printList(head);
       removeDuplicates(head);
       printList(head);
       std::cout << std::endl;

       head = buildList(list2);
       printList(head);
       removeDuplicates(head);
       printList(head);
       std::cout << std::endl;

       head = buildList(list4);
       printList(head);
       removeDuplicates(head);
       printList(head);
       std::cout << std::endl;
} 