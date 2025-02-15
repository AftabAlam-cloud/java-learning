public class Queue_From_Linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
     }
     static class queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;

        }
        public static void enqueue(int data){
            Node  newNode   = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
         }

         public static  int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            head = head.next;
            if(head == tail){
                tail = null;
            }
            return front;
         }
         public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
         }
         public static void print(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            Node currNode = head;
            while(currNode !=null){
                System.out.println(currNode.data + " ->");
                currNode = currNode.next;

            }
            System.out.println("null");

         }


     }
     public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.peek();
        q.enqueue(6);
        q.print();
        
     }


    
}
