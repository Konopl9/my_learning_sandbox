package stack;

import java.util.EmptyStackException;

public class Queue {
    private static final int MAX_SIZE = 1000;
    private final int[] queue;
    private int size;
    private int start;
    private int end;

    public Queue() {
        queue = new int[MAX_SIZE];
        size = 0;
        start = -1;
        end = -1;
    }

    public void enqueue(int value) {
        if(start == -1 && end == -1) {
            start = 0;
            end = 0;
        } else {
            end++;
        }
        size++;
        queue[end] = value;
    }

    public int dequeue() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        int value = queue[start++];
        size--;
        return value;
    }

    public int getSize() {
        return size;
    }
}
