package Queue;

public class Queue {
    private int[] element;
    private int size;

    public Queue() {
        this.size = 8;
    }

    public void enqueue(int v) {
        if (size == element.length) {
            int[] newElement = new int[element.length * 2];
            System.arraycopy(element, 0, newElement, 0, element.length);
            element = newElement;
        }
        element[size++] = v;
    }

    public int dequeue() {
        int a = element[0];
        for (int i = 0; i < element.length; i++) {
            element[i] = element[i + 1];
        }
        size--;
        return a;
    }

    public boolean empty() {
        if (size == 0) {
            return true;
        }
        else
            return false;
    }

    public int getSize() {
        return size;
    }
}
