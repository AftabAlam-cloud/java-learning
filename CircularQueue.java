public class CircularQueue {
    class Cqueue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Cqueue(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0; // Initialize front for the first element
            }
            rear = (rear + 1) % size; // Circular increment
            arr[rear] = data;
        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            if (rear == front) { // Single element case
                rear = front = -1;
            } else {
                front = (front + 1) % size; // Circular increment
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1; // Return an invalid value to indicate the queue is empty
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQueue outer = new CircularQueue();
        Cqueue q = outer.new Cqueue(5); // Create a queue object
        q.enqueue(1); // Enqueue elements
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue(); // Dequeue an element

        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Print the front element
            q.dequeue(); // Remove the front element

        }

    }
}
