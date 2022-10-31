import java.util.*;
// binary tree
public class createTreeInorder {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
        }
    }
    // static int idx = 0;
    public static void main(String[] args) {
        
        int[] inOrderArr = {4,2,5,1,3};     //12345
        Node ans = constructTreeInorder(inOrderArr, 0, inOrderArr.length-1, null);
        Inorder(ans);System.out.println();

        levelOrder(ans); System.out.println();

        reverseLevlOrder(ans); System.out.println();
    }
    
    public static Node constructTreeInorder(int[] arr, int s, int e, Node root){
        if(s>e) return null;

        int index = getMaxValueidx(arr, s, e);
        root = new Node(arr[index]); //5
        
        if(s==e){
            return root;
        }
        root.left=  constructTreeInorder(arr, s, index-1, root.left);
        root.right =  constructTreeInorder(arr, index+1, e , root.right);
        return root;
    }
    public static int getMaxValueidx(int[] arr, int s, int e){
        int max = arr[s];
        int maxidx = s;
        for(int i=s+1; i<=e; i++){
            if(arr[i] > max){
                max = arr[i];
                maxidx = i;
            }
        }
        return maxidx;
    }
    public static void Inorder(Node root){         //LNR
        if(root == null)    return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
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