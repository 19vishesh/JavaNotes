class Node
{
    int data;
    Node left, right;
  
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
  
class mergeTree
{
    Node root;
    Node buildTree(int inorder[], int start, int end, Node node)
    {
        if (start > end)
            return null;

        int i = max(inorder, start, end);

        node = new Node(inorder[i]);
  
        if (start == end)
            return node;
  
        node.left = buildTree(inorder, start, i - 1, node.left);
        node.right = buildTree(inorder, i + 1, end, node.right);
  
        return node;
    }
    int max(int arr[], int strt, int end)
    {
        int i, max = arr[strt], maxind = strt;
        for (i = strt + 1; i <= end; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                maxind = i;
            }
        }
        return maxind;
    }

    void printInorder(Node node)
    {
        if (node == null)
            return;

        printInorder(node.left);
  
        System.out.print(node.data + " ");
 
        printInorder(node.right);
    }
    public Node bstInorder(int[] arr1, int start, int end){
        if (start > end) {
            return null;
        }
 
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
 
        node.left = bstInorder(arr1, start, mid - 1);
        node.right = bstInorder(arr1, mid + 1, end);
         
        return node;
    }
    // void merge(int[] arr1, int[] arr2){

    // }
  
    public static void main(String args[])
    {
        mergeTree tree = new mergeTree();

        int inorder1[] = new int[]{ 1, 3, 5, 7, 9};
        int inorder2[] = new int[]{ 2, 4, 6, 8 };
        int len1 = inorder1.length-1;
        int len2 = inorder2.length-1;
        // Node mynode1 = tree.buildTree(inorder1, 0, len1 - 1, tree.root);
        // Node mynode2 = tree.buildTree(inorder2, 0, len2 - 1, tree.root);

        // System.out.println("Inorder traversal of the constructed tree is ");
        // tree.printInorder(mynode1);
        // System.out.println();
        // tree.printInorder(mynode2);

        // tree.merge(inorder1, inorder2);
        tree.root =  tree.bstInorder(inorder1, 0, len1);
        tree.printInorder(tree.root);
    }
}