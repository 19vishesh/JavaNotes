public class LinkedListImp
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
        Node lastnode = head;
        while(lastnode.next!=null){
            lastnode = lastnode.next;
        }
        lastnode.next = newNode;
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

    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();
        list.add(10);
        list.add(58);
        list.add(87);
        list.show();
    }
}