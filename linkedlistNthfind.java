public class linkedlistNthfind {
    Node head;
    public int size;   //size of the list   
        linkedlistNthfind(){   //constructor
            this.size = 0;
        }
        class Node{    //create a node class
            int data ;
            Node next;
            Node(int data){   //constructor
                this.data = data;
                this.next = null;
                size++;
            }
        }
        public void addFirst(int data){    //add node first
            Node newNode  = new Node (data);   //create a new node
            if(head == null){    
                head = newNode;  //if the list is empty
                return;
            }
            newNode.next = head;    //add the new node at the beginning of the list
            head = newNode;

        }
        public void print(){    //print the list
            Node currNode = head;   //start from the head node
            while(currNode != null){      //traverse the list
                System.out.print(currNode.data + " ->");
                currNode = currNode.next;
                
            }
            System.out.println("null");
        }

  //Delete nth node from the end of the node.......
        public void deleteNthNode(int n){
            if(head == null){             //if the list is empty
                System.out.println("The list is empty");
                return;
            }
            
            
            int index = size -n;   //index of the node to be deleted
            if(index < 0){       //if the index is invalid
                System.out.println("Invalid index"); 
                return;
            }
            if(index == 0){     //if the node to be deleted is the first node   
                head = head.next; 
                return;
            }
            Node currNode = head;   //if the node to be deleted is not the first node
            for(int i = 0; i< index -1; i++){   //traverse to the node before the node to be deleted
                currNode = currNode.next;        

            }
            currNode.next = currNode.next.next;  //delete the node
            size--;     //decrement the size of the list


        }



    public static void main(String[] args) {
        
        linkedlistNthfind n = new linkedlistNthfind();   //create a new linked list
        n.addFirst(40);  //add nodes to the list
        n.addFirst(30);
        n.addFirst(20);
        n.addFirst(10);
        n.print();
        System.out.println(n.size);
        n.deleteNthNode(2);     //delete the 2nd node from the end of the list
        n.print();
        System.out.println(n.size);
    }
    
}
