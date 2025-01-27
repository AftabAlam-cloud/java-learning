// Description: Check if a linked list is a pelindrom or not....
public class isPelindromLL {
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this .next = null;


        }
    }
    Node head;
    public void addLast(int data){
        Node newNode  = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }
    public void prinnt(){
        Node currNode  = head;
        while(currNode != null){
            System.out.println(currNode.data + "->");
            currNode = currNode.next;

        }
    }
    public boolean isPelindrom(){
       Node slow = head;
       Node fast = head;
         while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

         }
            Node prev = null;   //reverse the second half of the list
            Node next = null;
            Node curr = slow;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
        }
        Node first = head;
        Node second = prev;
        while(second != null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true; // Add this line to return true if the list is a palindrome
    }
    public static void main(String[] args) {
        isPelindromLL list = new isPelindromLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(0);
        System.out.println(list.isPelindrom());
    }
     
}
