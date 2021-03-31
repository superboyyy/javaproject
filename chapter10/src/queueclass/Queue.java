package queueclass;

public class Queue {
    private int[] element;
    private int size;

    public Queue() {
        element = new int[8];
    }

    public void enqueue(int v) {
        if (size >= element.length) {
            int[] temp = new int[element.length * 2];
            System.arraycopy(element, 0, temp, 0, element.length);
            element = temp;
        }

        element[size++] = v;
    }

    public int dequeue() {
        int v = element[0];

        for (int i = 0; i < size - 1; i++) {
            element[i] = element[i + 1];
        }

        size--;

        return v;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
