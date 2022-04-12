public class ArrayStack<E> implements Stack<E>
{
    // constants
    public final int INITIAL_SIZE = 10;

    // instance variables
    private E[] array;
    private int size;       // logical size


    // this is not usually a good thing to do.
    @SuppressWarnings({"unchecked"})
    public ArrayStack()
    {
        array = (E[])new Object[INITIAL_SIZE];
        size = 0;
    }

    @SuppressWarnings({"unchecked"})
    public void push(E item)
    {
        if(size == array.length)
        {
            // resize the array
            E[] temp = (E[])new Object[size + 1];
            for(int i = 0; i < array.length; i++)
            {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[size] = item;
        size++;
    }

    public E pop()
    {
        if(size == 0)
        {
            return null;
        }
        E item = array[size-1];
        array[size-1] = null;
        size--;
        return item;
    }

    public E peek()
    {
        if(size == 0)
        {
            return null;
        }
        return array[size-1];
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
        String result = "";
        for(int i = 0; i < size; i++)
        {
            result += array[i] + " ";
        }
        return result;
    }
}