public class linkedlistNthfind {
    Node head;
    public int size;
        linkedlistNthfind(){
            this.size = 0;
        }
        class Node{
            int data ;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
                size++;
            }
        }
        public void addFirst(int data){
            Node newNode  = new Node (data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }
        public void print(){
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data + " ->");
                currNode = currNode.next;
                
            }
            System.out.println("null");
        }

  //Delete nth node from the end of the node.......
        public void deleteNthNode(int n){
            if(head == null){
                System.out.println("The list is empty");
                return;
            }
            if(n == size){
                head = head.next;
                return;
            }
            int index = size -n;
            if(index < 0){
                System.out.println("Invalid index");
                return;
            }
            if(index == 0){
                head = head.next;
                return;
            }
            Node currNode = head;
            for(int i = 0; i< index -1; i++){
                currNode = currNode.next;

            }
            currNode.next = currNode.next.next;
            size--;


        }



    public static void main(String[] args) {
        
        linkedlistNthfind n = new linkedlistNthfind();
        n.addFirst(40);
        n.addFirst(30);
        n.addFirst(20);
        n.addFirst(10);
        n.print();
        System.out.println(n.size);
        n.deleteNthNode(2);
        n.print();
        System.out.println(n.size);
    }
    
}
