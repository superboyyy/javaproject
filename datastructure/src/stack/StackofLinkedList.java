package stack;

import java.util.LinkedList;

public class StackofLinkedList<x> {
    private LinkedList<x> stack = new LinkedList<>();

    public void push(x t) {
        stack.addFirst(t);
    }

    public x pop() {
        return stack.removeFirst();
    }

    public x peek() {
        x t = null;
        if (stack.isEmpty())
            t = stack.getFirst();
        return t;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
