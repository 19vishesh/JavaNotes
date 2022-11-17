public class reversePortion
{
    static Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node endNode = head;
        while(endNode.next!=null){
            endNode = endNode.next;
        }
        endNode.next = newNode;
    }

    public void show(){
        if(head==null) return;

        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public Node reverse(Node head, int m, int n){
        
        Node prev = null;
        Node curr = head;

        int i;
        for(i = 1; i < m && curr != null; i++){
            prev = curr;
            curr = curr.next;
        }

        Node rtail = curr;   // this is going to be tail of the reversed LL
        Node rhead = null;    // this will be head of the reversed LL

        while(i++ <= n){
            Node temp = curr.next;
            curr.next = rhead;
            rhead = curr;
            curr = temp;
        }

        // Now we rtail having no connections to remaining node list
        // and remaining node list head is present in curr no, (from line 55)

        if(prev != null)    // for checking if there is any list available before m
            prev.next = rhead;
        else
            head = rhead;

        // now connect the node list after n position that curr having head of that list
        rtail.next = curr;

        return head;
    }

    public static void main(String[] args) {
        reversePortion list = new reversePortion();
        int arr[] = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        list.show();
        list.reverse(head, 2,5);
        list.show();
    }
}