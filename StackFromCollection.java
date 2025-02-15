import java.util.*;
public class StackFromCollection {
    public static void addBottom(int data , Stack<Integer> stack){     //add an element at the bottom of the stack
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        addBottom(data , stack);
        stack.push(top);
    }
    
    public static void reverse(Stack<Integer> stack){          //reverse the stack function
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        addBottom(top , stack);
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Original stack: " + stack);

        
        reverse(stack);
    
        System.out.println("Reversed stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Size of stack: " + stack.size());
    }
}
