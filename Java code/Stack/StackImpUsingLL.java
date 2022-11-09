
public class StackImpUsingLL {
    StackNode root;
    static class StackNode{
        int data;
        StackNode next;
        public StackNode(int data){
            this.data = data;
        }
    }
    public boolean isEmpty(){
        if(root == null)
            return true;
        else
            return false;
    }
    public void push(int data){
        StackNode newNode = new StackNode(data);

        if(root==null)
            root = newNode;
        else{
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
    }
    public void pop(){
        if(root==null) return;
        else{
            root = root.next;
        }
    }
    public int peek(){
        if(root==null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else
            return root.data;
    }

    public static void main(String[] args) {
        StackImpUsingLL stack = new StackImpUsingLL();
        stack.push(10);
        stack.push(65);
        stack.push(89);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
