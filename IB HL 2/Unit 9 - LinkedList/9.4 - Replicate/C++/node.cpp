#include "include/node.hpp"

Node::Node(std::string initValue, Node* initNext) 
{
	value = initValue;
	next = initNext;
}

Node::Node() 
{
	value = "";
	next = nullptr;
}

std::string Node::getValue() 
{
	return value;
}

Node* Node::getNext() 
{
	return next;
}

void Node::setValue(std::string newVal) 
{
	value = newVal;
}

void Node::setNext(Node* newNext) 
{
	next = newNext;
}