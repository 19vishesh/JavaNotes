import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class PreOrderTreeCreation{
    static class Node{
        Node left, right;
        int data;
    
        Node(int data){
            this.data = data;
        }
    } 
    
    static class binaryTree{
        static int idx = -1;
        public Node creatTree(int[] arr){

            idx++;
            if(arr[idx]==-1)
                return null;

            Node newNode = new Node(arr[idx]);
            newNode.left = creatTree(arr);
            newNode.right = creatTree(arr);

            return newNode;
        }
    }
    public static void main(String[] args) {
        // int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int arr[] = {1,2,3,4,5, -1,-1,-1,-1,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.creatTree(arr);

        PreOrder(root); System.out.println();
        PostOrder(root); System.out.println();

        levelOrder(root); System.out.println();

        reverseLevlOrder(root); System.out.println();
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

    public static void levelOrder(Node root) {
        if(root==null)  return;

        Queue<Node> q = new LinkedList<>();        
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+ " ");

            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);

        }
    }

    public static void reverseLevlOrder(Node root){
        if(root==null)  return;

        Stack<Node> s = new Stack<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            s.push(curr);

            if(curr.right!=null)
                q.add(curr.right);
            
            if(curr.left!=null)
                q.add(curr.left);
        }
        while(!s.empty()){
            System.out.print(s.pop().data + " ");
        }
    }
}



