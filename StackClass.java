public class StackClass {  //create a stack class
    static class Node {    //create a node class
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
   }
    static class stack{    //create a stack class
        Node top;
        int size;
        stack(){
            this.top = null;
            this.size = 0;   

        }
        public void push(int data){            //push the element to the stack
            Node newNode  = new Node(data);
            if(top == null){
                top = newNode;
            } else {
                newNode.next = top;   //add the new node at the top of the stack
                top = newNode;
            }
            size++;
         }
         public void pop(){        //pop the element from the stack
            if(top == null){
                System.out.println("The stack is empty");
                return;
            }
            top = top.next;    //remove the top element   
            size--;
         }
         public void print(){         //print the stack
            Node currNode = top;
            while(currNode != null){
                System.out.println(currNode.data + " ->");
                currNode = currNode.next;

            }
            System.out.println("nul");
         }
         public int peek(){    //return the top element of the stack
            if(top == null){
                System.out.println("The stack is empty");
                return -1;
            }
            return top.data;
         }
         public int size(){       //return the size of the stack
            return size;
         }
            public boolean isEmpty(){     //check if the stack is empty
                return top == null;
            }
        }
public static void main(String[] args) {
       stack s = new stack();     //create a stack object
        s.push(1);           //push elements to the stack
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.print();
        System.out.println("The size of the stack is: " + s.size());
        System.out.println("The top element of the stack is: " + s.peek());
        s.pop();       //pop the element from the stack
        s.pop();
        s.print();
        System.out.println("The size of the stack is: " + s.size());
        System.out.println("The top element of the stack is: " + s.peek());
        System.out.println("Is the stack empty: " + s.isEmpty());
        
     
        
    }
    
}
