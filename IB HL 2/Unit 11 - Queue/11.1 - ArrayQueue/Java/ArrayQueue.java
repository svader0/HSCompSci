import java.util.EmptyStackException;

public class ArrayQueue<E> implements Queue<E>
{
    // constants
    public final int INITIAL_SIZE = 10;

    // instance variables
    private E[] array;
    private int size;       // logical size

    @SuppressWarnings({"unchecked"})
    public ArrayQueue()
    {
        array = (E[])new Object[INITIAL_SIZE];
        size = 0;
    }

    @SuppressWarnings({"unchecked"})
    public void enqueue(E item)
    {
        if(size == array.length)
        {
            E[] temp = (E[])new Object[array.length * 2];
            for(int i = 0; i < array.length; i++)
                temp[i] = array[i];
            array = temp;
        }
        array[size++] = item;
    }

    @SuppressWarnings({"unchecked"})
    public E dequeue()
    {
        E item = array[0];
        for (int i = 0; i < size - 1; i++)
            array[i] = array[i + 1];
        size--;
        return item;
    }
    

    public E front()
    {
        if (size == 0)
            return null;
        return array[0];
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size == array.length;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++)
        {
            sb.append(array[i]);
            if (i < size - 1)
                sb.append(", ");
        }
        return sb.toString();
    }
}