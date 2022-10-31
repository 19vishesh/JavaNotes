import java.rmi.NoSuchObjectException;

class LinkedList_middle_remove {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 

    public static Node deleteMiddleElement(Node head) {
		//return the head of the modified Linked List
        // if(head.next==null){
        //     head.next=new Node(-1);
        //     return head.next.next;
        // }
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int mid = count/2;
        int sum=0;
        while(head!=null){           
            System.out.print(head+" ");
            head=head.next;
            sum++;
            if(sum==mid){
                head=head.next.next;
            }
        }
        return head;

    }
 
    // prints content of double linked list
    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        //LinkedList list = new LinkedList();
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        printList(head);
        System.out.println();
 
        head = deleteMiddleElement(head); 
        System.out.println("Linked List after deletion of middle");
        printList(head);
        
    }

    static Node newNode(int data)
    {
        Node temp = new Node(data);
        temp.data = data;
        temp.next = null;
        return temp;
    }
 
}