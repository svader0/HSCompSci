#include <iostream>
#include <string>
#include <vector>
#include "node.hpp"

Node* head;
std::vector<int> list1 {10,7,26,5,31,55,64,19,89,42,75,8};
std::vector<int> list2 {1,2,3,2,3,4,3,4,2,1,1,2,5,4,3,2,2,5};

// Precondition:  cur points to the beginning of a list
    // Postcondition: method returns true if key value is found
    //                in the list; otherwise returns false
bool recursiveSearch(Node* cur, int key)
{
	if (cur == nullptr)
		return false;

	if(cur->getValue() == key)
		return true;

	return recursiveSearch(cur->getNext(), key);
}

    // Precondition:  cur points to the beginning of a list
    // Postcondition: method returns a count of the number of
    //                times the key value occurs in the list
int numOccurrences(Node* cur, int key)
{	
	if (cur == nullptr)
		return 0;
		
	if (cur->getValue() == key)
		return numOccurrences(cur->getNext(), key) + 1;

	return numOccurrences(cur->getNext(), key);

}

void printList(Node* cur)
    {
        if(cur != nullptr)
        {
            std::cout << cur->getValue() <<  " ";
            printList(cur->getNext());  // recursive call
        }
        else
            std::cout << std::endl;
    }

Node* buildList(std::vector<int>* list)
    {
        Node* start = new Node(list->at(0), nullptr);
        Node* cur = start;
        for(int i = 1; i < list->size(); i++)
        {
           Node* newNode = new Node(list->at(i), nullptr);
           cur->setNext(newNode);
           cur = newNode;
        }
        return start;
    }



int main(int argc, char **argv) {
	std::cout << ("Test RecursiveSearch\n");
    std::cout << ("====================\n");
    std::string ans = "y";
    int key = 0;
    while(ans == "y" || ans == "Y")
    {
        head = buildList(&list1);
        printList(head);
        std::cout << ("Enter search key --> ");
        std::cin >> key;
        if(recursiveSearch(head, key) == true)
        {
            std::cout << "Search key " << key << " found!\n";
        }
        else
        {
            std::cout << "Search key " << key << " not found!";
        }
        std::cout << std::endl;
        std::cout << "Search Again(Y/N)? --> ";
		std::cin >> ans;
	}

	// Test numOccurrences
    std::cout << std::endl;
    std::cout << std::endl;
    std::cout << ("Test numOccurrences\n");
    std::cout << ("===================\n");
    head = buildList(&list2);
    printList(head);
    std::cout << std::endl;

       int count = numOccurrences(head, 1);
       std::cout << "Number of 1s = " << count << std::endl;
       count = numOccurrences(head, 2);
       std::cout << "Number of 2s = " << count << std::endl;
       count = numOccurrences(head, 3);
       std::cout << "Number of 3s = " << count << std::endl;
       count = numOccurrences(head, 4);
       std::cout << "Number of 4s = " << count << std::endl;
       count = numOccurrences(head, 5);
       std::cout << "Number of 5s = " << count << std::endl;
	return 0;
}