import javax.xml.transform.Templates;

public class SingleLinkedList{
    
    public static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    public static class LinkedList{
        Node head;
        Node tail;
        private int length;

        public void add(Node node) {
            // if head == null
            if(head == null){
                // LinkedList is empty
                // tasks -> head -> node1
                    //   -> tail -> node1
                    //   -> size -> 1
                head = node;
                tail = node;
                length = 1;
            }else{
                // LL not empty
                // Tail.next -> node
                // tail -> node
                tail.next = node;
                tail = node;
                length++;
            }
            // if head != null
        }

        // addFirst
        public void addFirst(SingleLinkedList.Node node) {
            if(head == null){
                head = node;
                tail = node;
                length = 1;
            }else{
                node.next = head;
                head = node;
                length++;
            }
        }
        
        // removeFirst

        // removeLast
        // updateLength

        // getLength
        public int getLength(){ 
            return this.length;
        }

        public Node removeFirst() {
            if(head == null){
                System.out.println("List is empty");
                return null;
            }else{
                Node removedNode = head;
                head = head.next;

                removedNode.next = null;
                length--;
                return removedNode;
            }
        }

        public Node removeLast(){
            if(tail == null){
                return null;
            }else{
                Node temp = head;
                while(temp.next != tail){
                    temp = temp.next;   
                }
                    Node removed = tail;
                    tail = temp;
                    tail.next = null;
                    length--;
                    return removed;
            }
        }

        public void addAt(Node node,)
    }

    public static void main(String[] args) {  
        LinkedList linkedList = new LinkedList();

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        linkedList.add(node1);
        linkedList.addFirst(node2);
        linkedList.addFirst(node3);
        linkedList.add(node4);

        // System.out.println(linkedList.getLength());

        Node removedNode = linkedList.removeFirst();
        // System.out.println(removedNode.val);
        System.out.println(linkedList.length);

        Node removedLast = linkedList.removeLast();
        System.out.println(removedLast.val);
    }
}