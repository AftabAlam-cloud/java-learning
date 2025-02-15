public class Queue {
    static class queue {
        static int arr[];
        static int rear = -1;
        static int size;

        queue(int n) {
            arr = new int[n];
            size = n; // Correctly set the capacity
        }

        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data; // Insert at rear
        }

        public void dequeue() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < rear; i++) { // Shift elements
                arr[i] = arr[i + 1];
            }
            rear--; // Decrement rear
        }

        public void peek() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(arr[0]); // First element is at the front
        }

        public void print() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i <= rear; i++) { // Iterate up to rear
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public void size() {
            System.out.println("Current size of the queue: " + (rear + 1)); // Rear + 1 gives current size
        }
    }

    public static void main(String[] args) {
        queue q = new queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.peek();
        q.print();
        q.size();
    }
}
