package cz.cvut.fel.pjv;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {

    private final String [] queue;
    private int head, tail, count;

    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        this.queue = new String[5];
        this.head = this.tail = this.count = 0;
    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        this.queue = new String[capacity];
        this.head = this.tail = this.count = 0;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public boolean isFull() {
        return this.count == this.queue.length;
    }

    @Override
    public boolean enqueue(String obj) {
        if (isFull() || obj == null) {
            return false;
        } else {
            this.queue[this.tail] = obj;
            this.tail = (this.tail + 1) % this.queue.length;
            this.count++;
            return true;
        }
    }

    @Override
    public String dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            String headElement = this.queue[this.head];
            this.queue[this.head] = null;
            this.head = (this.head + 1) % this.queue.length;
            this.count--;
            return headElement;
        }
    }

    @Override
    public void printAllElements() {
        for (String s : this.queue) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
