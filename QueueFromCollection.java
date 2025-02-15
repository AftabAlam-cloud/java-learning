// import java.util.*;
// import java.util.Queue;
// public class QueueFromCollection {
//     public static void main(String[] args) {
//         Queue <Integer> queue = new LinkedList<>();
//         queue.add(1);
//         queue.add(2);
//         queue.add(3);
//         queue.add(4);

//         while(!queue.isEmpty()){
//             System.out.println(queue.peek());
//             queue.remove();
//         }
       


//     }
// }





//Queue Using two stacks..................
import java.util.*;
import java.util.Queue;
public class QueueFromCollection {
    static class queue{
       static Stack<Integer> stack1 = new Stack<>();
       static Stack<Integer> stack2 = new Stack<>();
    
        public static boolean isEmpty(){
            return stack1.isEmpty() && stack2.isEmpty();
        }

        public static void enqueue(int data){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());

            }
            stack1.push(data);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());

            }
         }
         public static void dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            stack1.pop();
         }
         public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }   
            return stack1.peek();
        }
    
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    

    }
}