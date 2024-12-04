package stack;

import java.util.EmptyStackException;

public class StackLL {
    private Node last;
    private int size;

    public StackLL() {
        last = null;
        size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = last;
        last = newNode;
        size++;
    }

    public int pop() {
        if (last == null) {
            throw new EmptyStackException();
        }
        Node nodeToRemove = last;
        last = last.next;
        size--;
        return nodeToRemove.value;
    }

    public int peek() {
        if (last == null) {
            throw new EmptyStackException();
        }
        return last.value;
    }

    public int size() {
        return size;
    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}


