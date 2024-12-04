package stack;

import java.util.NoSuchElementException;

public class QueueLL {

    private Node start;
    private Node end;
    private int size;

    public QueueLL() {
        start = null;
        end = null;
        size = 0;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            start = newNode;
        } else {
            end.next = newNode;
        }
        end = newNode;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Node toRemove = start;
        start = start.next;
        size--;
        if (size == 1) {
            end = null;
        }
        return toRemove.value;
    }

    public int size() {
        return size;
    }

    private static class Node {
        int value;
        Node next;

        public Node(int val) {
            this.value = val;
        }
    }
}
