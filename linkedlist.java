public class linkedlist {
    Node head; // Declare head as a member variable
//
    private int size;
    linkedlist(){
        this.size = 0;
    }

// create a node class..........

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size++;

        }
    }
    
    //add node first...
    public void addFirst(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }

    //add node last...

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
           return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;

        } 
        currNode.next = newNode;
        
    }
//delete node first........

 public void deleteFirst(){
    if(head == null){
        System.out.println("The list is empty");
    }
    size--;
    head = head.next;
    
 }
//delete node last.......

 public void deleteLast(){
    if(head == null){
        System.out.println("list is  empty");
    }
    size--;
    if(head.next == null){
        head = null;
        return;
    }
    Node secondLast = head;
    Node lastNode = head.next;

    while(lastNode.next != null){
        secondLast = secondLast.next;
        lastNode = lastNode.next;
    }
    secondLast.next = null;
 }

    public void printList(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
}

//print size of the linked list.....

public int printSize(){
    return size;
}

//reverse the linked list.......
public void reverse(){
    if(head == null || head.next == null){
        return;
    }
    Node prev = head;
    Node currNode = head.next;
    while(currNode != null){
        Node next = currNode.next;
        currNode.next = prev;

        prev = currNode;
        currNode = next;

    }
    head.next = null;
    head = prev;

}
//main method.....
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst(40);  //calling addFirst method
        ll.addFirst(30);  //calling addFirst method
        ll.addFirst(20); //calling addFirst method
        ll.addFirst(10);  //calling addFirst method
        ll.addLast(50); //calling addLast method
        ll.printList(); //calling printList method

        ll.deleteFirst();  //calling deleteFirst method
        ll.printList(); //calling printList method
        ll.deleteLast();    //calling deleteLast method
        ll.printList();     //calling printList method

        //print size of the linked list
        System.out.println("Size of the linked list is: " + ll.printSize());
        ll.reverse();  //calling reverse method
        System.out.println("After reversing the linked list: ");
        ll.printList(); //calling printList method

        
    }
    
}


//predefiend linked list class.....ANOTHER METHOD TO IMPLEMENT LINKED LIST...

// import java.util.LinkedList;

// public class linkedlist {
//      public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<Integer>();
//         list.addFirst(10);
//         list.addFirst(5);
//         list.addLast(20);
//         list.addLast(30);
//         System.out.println(list);
//         list.removeFirst();
        
//         System.out.println(list);
//         System.out.println(list.size());

//         for(int i : list){
//             System.out.print(i + " ");
//         }
//      }
// }