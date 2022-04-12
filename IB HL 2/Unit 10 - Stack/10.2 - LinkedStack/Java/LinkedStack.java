import java.util.EmptyStackException;

public class LinkedStack<E> implements Stack<E> 
{

    private ListNode head = new ListNode(0, null); // dummy head

    @Override
    public void push(E item) {
        head.setNext(new ListNode(item, head.getNext()));
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E item = (E)head.getNext().getValue();
        head.setNext(head.getNext().getNext());
        return item;
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public E peek() {
        if (isEmpty()) 
        {
            throw new EmptyStackException();
        }
        return (E)head.getNext().getValue();
    }

    @Override
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        ListNode current = head.getNext();
        while (current != null) 
        {
            sb.append(current.getValue() + " ");
            current = current.getNext();
        }
        return sb.toString();
    }

}
