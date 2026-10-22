package Day11;

public class ArrayDequeCustom {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public ArrayDequeCustom(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFront(int item) {
        if (isFull()) {
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        arr[front] = item;
        size++;
    }

    public void addLast(int item) {
        if (isFull()) {
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        arr[rear] = item;
        size++;
    }

    public int deleteFront() {
        if (isEmpty()) {
            return -1;
        }

        int item = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return item;
    }

    public int deleteLast() {
        if (isEmpty()) {
            return -1;
        }

        int item = arr[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }

        size--;
        return item;
    }

    public void display() {
        if (isEmpty()) {
            return;
        }

        int count = 0;
        int i = front;
        while (count < size) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
            count++;
        }
        System.out.println();
    }
}
