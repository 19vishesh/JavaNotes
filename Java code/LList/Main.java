package LList;

//import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(5);
        list.insertFirst(3);
        
        list.insertLast(99);

        list.display();
    }    
}