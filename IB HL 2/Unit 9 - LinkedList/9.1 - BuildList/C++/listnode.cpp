#include "listnode.h"

ListNode::ListNode(int initValue, ListNode* initNext) 
{
	m_value = initValue;
	m_next = initNext;
}

int ListNode::getValue() 
{
	return m_value;
}
ListNode* ListNode::getNext() 
{
	return m_next;
}
void ListNode::setValue(int newVal) 
{
	m_value = newVal;
}
void ListNode::setNext(ListNode* newNext) 
{
	m_next = newNext;
}