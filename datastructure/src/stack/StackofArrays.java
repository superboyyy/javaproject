package stack;

public class StackofArrays {
    private Object[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 10;

    /**
     * Construct a stack with the default capacity 10
     */
    public StackofArrays() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Construct a stack with the specified maximum capacity
     */
    public StackofArrays(int capacity) {
        elements = new Object[capacity];
    }

    /**
     * Push a new integer to the top of the stack
     */
    public void push(int value) {
        if (size >= elements.length) {
            Object[] temp = new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    /**
     * Return and remove the top element from the stack
     */
    public Object pop() {
        return elements[--size];
    }

    /**
     * Return the top element from the stack
     */
    public Object peek() {
        return elements[size - 1];
    }

    /**
     * Test whether the stack is empty
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Return the number of elements in the stack
     */
    public int getSize() {
        return size;
    }
}
