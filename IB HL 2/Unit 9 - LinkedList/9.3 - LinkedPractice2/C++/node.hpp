#ifndef NODE_H
#define NODE_H

class Node
{
private:
	int value;
	Node * next;
public:
	Node(int initValue, Node * initNext);
	Node();
	int getValue();
	Node* getNext();
	void setValue(int newVal);
	void setNext(Node* newNext);
	
};

#endif