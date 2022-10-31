class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
    }

}
// binary tree
public class CreateTree {
    
    static int idx = 0;
    public static void main(String[] args) {
        int[] preOrderArr = {4 ,2, 5, 1, 3};
        // create using InOrder, PreOrder, PostOrder
        // int mid = (0+preOrderArr.length-1)/2;
        // Node root = null;
        constructTreeInorder(preOrderArr, 0, preOrderArr.length-1, null);

    }

    public static Node constructTreeInorder(int[] arr, int s, int e, Node root){
        if(s>e) return null;
        int idx = getMaxValueidx(arr, s, e);
        // mid = s+e/2;
        root = new Node(arr[idx]);
        if(s==e){
            return root;
        }
        
        root.left=  constructTreeInorder(arr, 0, idx-1, root.left);
        root.right =  constructTreeInorder(arr, idx+1, e , root.right);

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


    // public static void Inorder(Node root){         //LNR
    //     if(root == null)    return;
        
    //     Inorder(root.left);
    //     System.out.print(root.data+" ");
    //     Inorder(root.right);
    // }
    // public static void PreOrder(Node root){        //NLR
    //     if(root == null)    return;
        
    //     System.out.print(root.data+" ");
    //     PreOrder(root.left);
    //     PreOrder(root.right);
    // }
    // public static void PostOrder(Node root){       //LRN
    //     if(root == null)    return;
    
    //     PostOrder(root.left);
    //     PostOrder(root.right);
    //     System.out.print(root.data+" ");
    // }

}