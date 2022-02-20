#include "node.hpp"

Node::Node(int initValue, Node* initNext) 
{
	value = initValue;
	next = initNext;
}

Node::Node() 
{
	value = 0;
	next = nullptr;
}

int Node::getValue() 
{
	return value;
}

Node* Node::getNext() 
{
	return next;
}

void Node::setValue(int newVal) 
{
	value = newVal;
}

void Node::setNext(Node* newNext) 
{
	next = newNext;
}