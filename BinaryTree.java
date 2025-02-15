import java.util.*;
import java.util.Queue;

public class BinaryTree {
   static class Node{
    int data;
    Node left;
     Node right;
     Node(int data){
        this.data = data;
        this.left  = null;
        this.right = null;
     }

   }

   //TREE CREATING..............

   static class binarytree{
    static int index = -1;
    public static Node createTree(int nodes[]){
        index++;
        if(nodes[index] == -1){
            return null;
        }
        Node newNode = new Node(nodes[index]);  
        newNode.left = createTree(nodes);   
        newNode.right = createTree(nodes);
        return newNode;

} 


}
//PREORDER.........................

public static void preOreder(Node root){
    
    if(root == null){
        return;
    }
    
    System.out.print(root.data + " ");
    preOreder(root.left);
    preOreder(root.right);
}

//INORDER.......................

public static void inOrder(Node root){
    
    if(root == null){
        return;
    }
    
    inOrder(root.left);
    
    System.out.print( root.data + " ");
    inOrder(root.right);
}

//POSTORDER........................

public static void postOrder(Node root){
    if(root == null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
}

//LEVELORDER..........................

public static void LevelOrder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node currNode = q.remove();
    
       if(currNode == null){
        System.out.println();
        if(q.isEmpty()){
            break;
        }else{
            q.add(null);
        }
    }
    else{
        System.out.print(currNode.data + " ");
        if(currNode.left != null){
            q.add(currNode.left);
        }
        if(currNode.right != null){
            q.add(currNode.right);
        }
    }
    } 

}

//COUNT NODES..................

public static int countNode(Node root){
    if(root == null){
        return 0;
    }
   int leftNode = countNode(root.left);
   int rightNode = countNode(root.right);
   return leftNode + rightNode +1;
}

//SUMNODES...................

public static int sumNode(Node root){
    if(root == null ){
        return 0;
    }
    int sumleft = sumNode(root.left);
    int sumright = sumNode(root.right);
    return sumleft + sumright + root.data;

}

//HEIGHT.........................
public static int height(Node root){
    if(root == null){
        return 0;
    }
    int leftNode = height(root.left);
    int rightNode  = height(root.right);
    int heightNode = Math.max(leftNode, rightNode) +1;
    return heightNode;
}

//DIAMETER......................

public static class TreeInfo{
    int ht;
    int diam;
    TreeInfo(int ht , int diam){
        this.ht = ht;
        this.diam = diam;
    }

    public  static TreeInfo Diameter(Node root){
        if(root == null){
           return new TreeInfo(0 , 0);
        }
        TreeInfo left = Diameter(root.left);
        TreeInfo right = Diameter(root.right);
        int height = Math.max(left.ht, right.ht) +1; 

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht +1;

        int mydiam = Math.max(Math.max(diam1, diam2) , diam3);

        TreeInfo info = new TreeInfo(height, mydiam);
        return info;


    }
}
   
    
    public static void main(String[] args) {
        int nodes[] = {1, 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , 6 , -1 , -1 , 7 , -1 , -1}; 
        binarytree bt = new binarytree(); 
        Node root = bt.createTree(nodes); 
        System.out.print("preOrder is:");
        preOreder(root);
        System.out.println();
        System.out.print("inOrder is: ");
        inOrder(root);
        System.out.println();
        System.out.print("postOrder is:");
        postOrder(root);
        System.out.println();

        System.out.println("LevelOrder is:");
        LevelOrder(root);

        System.out.println( "Node count is:"+ " "+countNode(root));

        System.out.println("sum of nodes is:" + sumNode(root));

        System.out.println("Height" + height(root));


        System.out.println(TreeInfo.Diameter(root).diam);



    }
}
