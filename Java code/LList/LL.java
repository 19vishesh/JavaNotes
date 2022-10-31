package LList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            size = 1;
        }else{
            node.next = head;
            head = node;
            size++;
        }
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            size = 1;
        }else{
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);    
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;     
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
    }
    private class Node{
        private int value;
        private Node next;
        
        public Node (int value){
            this.value = value;
        }
        public Node (int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    
}
