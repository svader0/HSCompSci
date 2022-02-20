#ifndef NODE_H
#define NODE_H

#include <string>

class Node
{
private:
	std::string value;
	Node* next;
public:
	Node(std::string initValue, Node* initNext);
	Node();
	std::string getValue();
	Node* getNext();
	void setValue(std::string newVal);
	void setNext(Node* newNext);
};

#endif