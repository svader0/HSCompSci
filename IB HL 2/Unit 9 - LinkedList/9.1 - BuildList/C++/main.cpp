#include "listnode.h"
#include <iostream>

void printList(ListNode * head);
void build1();
void build2();
void build3();
void build4();
void build5();

int main() {
	build1();
	build2();
	build3();
	build4();
	build5();
}

void deleteList(ListNode* head)
{
    ListNode* prev = head;
 
    while (head)
    {
        head = head->getNext();
        delete (prev);
        prev = head;
    }
}

void printList(ListNode* head) {
	ListNode* currNode = head;
    while (head != NULL) {
        std::cout << head->getValue() << " ";
        head = head->getNext();
    }
	std::cout << std::endl;
}

void build1() 
{
	ListNode* node5 = new ListNode(5, nullptr);
	ListNode* node4 = new ListNode(4, node5);
	ListNode* node3 = new ListNode(3, node4);
	ListNode* node2 = new ListNode(2, node3);
	ListNode* node1 = new ListNode(1, node2);
	printList(node1);
	deleteList(node1);
}

void build2() 
{
	ListNode* node5  = new ListNode(5, nullptr);
	ListNode* node4  = new ListNode(4, nullptr);
	ListNode* node3  = new ListNode(3, nullptr);
	ListNode* node2  = new ListNode(2, nullptr);
	ListNode* node1  = new ListNode(1, nullptr);

	node1->setNext(node2);
	node2->setNext(node3);
	node3->setNext(node4);
	node4->setNext(node5);

	printList(node1);
	deleteList(node1);
}

void build3() 
{
	ListNode* head = new ListNode(1, nullptr);
	ListNode* currNode = head;
	int num = 2;
	while (num <= 20) 
	{
		ListNode* newNode = new ListNode(num, nullptr);
		currNode->setNext(newNode);
		currNode = currNode->getNext();
		num++;
	}
	printList(head);
	deleteList(head);
}

void build4() 
{
	ListNode* head = nullptr;
	ListNode* currNode = nullptr;
	for (int i = 1; i<=20; i++) 
	{
		if (head == nullptr) 
		{
			head = new ListNode(i, nullptr);
			currNode = head;
		}
		else 
		{
			ListNode* newNode = new ListNode(i, nullptr);
			currNode->setNext(newNode);
			currNode = currNode->getNext();
		}
	}
	printList(head);
	deleteList(head);
}

void build5() 
{
	ListNode* head = nullptr;
	for (int i = 1; i<=20; i++) 
	{
		head = new ListNode(i, head);
	}
	printList(head);
	deleteList(head);
}
