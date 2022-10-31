import java.util.*;

class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}
public class Tree{
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Node root = creatTree();
        Inorder(root);
        System.out.println();
        PreOrder(root);
        System.out.println();
        PostOrder(root);
        System.out.println();
    }

    static Node creatTree(){

        Node root = null;
        System.out.println("Enter the root data: ");
        int data = sc.nextInt();

        if(data == -1)
            return null;
        
        root = new Node(data);

        System.out.println("Enter left for "+ data);
        root.left = creatTree();

        System.out.println("Enter right for "+ data);
        root.right = creatTree();

        return root;
    }
                            // 1,2,3,4,5
    static void Inorder(Node root){         //LNR       //4 2 5 1 3
        if(root == null)    return;
        
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    static void PreOrder(Node root){        //NLR
        if(root == null)    return;
        
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    static void PostOrder(Node root){       //LRN
        if(root == null)    return;
       
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }

}
