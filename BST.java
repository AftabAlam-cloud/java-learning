import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
     }
//insert element inn tree.............

     public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);

        }
        else{
            root.right = insert(root.right, val);

        }
        return root;
     }
//inorder for check print in order or not.............

     public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
     }

//search element in tree................

     public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
     }

     //delete node in tree....................

     public static Node delete(Node root , int val){

        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{ //root.data == val
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            Node IS = InOrdersuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
     }

     public static Node InOrdersuccessor(Node root){
         while(root.left != null){
             root = root.left;
         }
         return root;
     }

     //FIND NODES IN GIVEN RANGE..............

     public static void  findinrange(Node root , int x , int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            findinrange(root.left, x, y);
            System.out.print(root.data + " ");
            findinrange(root.right, x, y);
        }
        else if(root.data > y){
            findinrange(root.left, x, y);
        }
        else{
            findinrange(root.right, x, y);
        }
     }

     //print path of  node
     public static void printpath(ArrayList<Integer>path){
        for(int i = 0 ; i < path.size(); i++){
            System.out.print(path.get(i) + "->" + " ");
        }
        System.out.println();
     }

     //root to leaf traversal.....................
     
     public static void root2leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            printpath(path);
        }
        else{
            root2leaf(root.left, path);
            root2leaf(root.right, path);
        }
     }
    
    public static void main(String[] args) {
        int values [] = {5,4,7,3,1,2 , 12 , 15, 9, 8};

        Node root  = null;

        for(int i = 0; i < values.length; i++){
          root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

    //     if(search(root, 9)){
    //         System.out.println("Element found");
    //     }else{
    //         System.out.println("Not found");
    //     }
    // 

    // delete(root, 2);
    // inorder(root);

    //findinrange(root, 2, 8);
    root2leaf(root, new ArrayList<>());
}
}
