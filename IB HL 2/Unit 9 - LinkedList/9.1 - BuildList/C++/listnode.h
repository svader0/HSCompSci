struct ListNode
{
private:
	int m_value;
	ListNode * m_next;
public:
	ListNode(int initValue, ListNode* initNext);
	int getValue();
	ListNode* getNext();
	void setValue(int newVal);
	void setNext(ListNode* newNext);
};