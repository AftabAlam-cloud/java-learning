public class StackClass {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
   }
    static class stack{
        Node top;
        int size;
        stack(){
            this.top = null;
            this.size = 0;

        }
        public void push(int data){
            Node newNode  = new Node(data);
            if(top == null){
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
            size++;
         }
         public void pop(){
            if(top == null){
                System.out.println("The stack is empty");
                return;
            }
            top = top.next;
            size--;
         }
         public void print(){
            Node currNode = top;
            while(currNode != null){
                System.out.println(currNode.data + " ->");
                currNode = currNode.next;

            }
            System.out.println("nul");
         }
         public int peek(){
            if(top == null){
                System.out.println("The stack is empty");
                return -1;
            }
            return top.data;
         }
         public int size(){
            return size;
         }
            public boolean isEmpty(){
                return top == null;
            }
        }
public static void main(String[] args) {
       stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.print();
        System.out.println("The size of the stack is: " + s.size());
        System.out.println("The top element of the stack is: " + s.peek());
        s.pop();
        s.pop();
        s.print();
        System.out.println("The size of the stack is: " + s.size());
        System.out.println("The top element of the stack is: " + s.peek());
        System.out.println("Is the stack empty: " + s.isEmpty());
        
     
        
    }
    
}
