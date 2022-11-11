import java.util.*;
public class ListSorting
{
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void push(int data){
        Node newNode = new Node(data);
        
        if(head== null){
            head = newNode;
            return;
        }
        
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
            
    }
    public static void sortList(){
        ArrayList<Integer> list = new ArrayList<>();
        Node curr1 = head;
            while(curr1!=null){
                list.add(curr1.data);
            }
        Collections.sort(list);
        
        Node temp = head;
        for(int i=0; i<list.size(); i++){
            temp.data = list.get(i);
            temp = temp.next;
        }
        
    }
    public static void printList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    
	 public static void main(String[] args) {
        // ListSorting llist = new ListSorting();
        push(0);       
        push(1);       
        push(0);        
        push(2);        
        push(1);        
        push(1);        
        push(2);        
        push(1);       
        push(2);
		
        System.out.println("Linked List before sorting");        
        // printList();        
        sortList();
        
        System.out.println("Linked List after sorting");        
        printList();

        }
    }
