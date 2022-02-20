#include "node.h"

Node::Node(int initValue, Node* initNext) 
{
	m_value = initValue;
	m_next = initNext;
}

int Node::getValue() 
{
	return m_value;
}

Node* Node::getNext() 
{
	return m_next;
}

void Node::setValue(int newVal) 
{
	m_value = newVal;
}

void Node::setNext(Node* newNext) 
{
	m_next = newNext;
}