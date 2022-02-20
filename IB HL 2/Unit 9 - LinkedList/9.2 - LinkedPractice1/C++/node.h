#ifndef NODE_H
#define NODE_H

struct Node
{
private:
	int m_value;
	Node* m_next;
public:
	Node(int initValue, Node* initNext);
	int getValue();
	Node* getNext();
	void setValue(int newVal);
	void setNext(Node* newNext);
};

#endif