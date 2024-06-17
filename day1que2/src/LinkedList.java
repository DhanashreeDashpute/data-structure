import javax.swing.plaf.nimbus.State;
import java.util.Stack;

public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public LinkedList() {
        head = null;
    }

    public boolean insert(Product product) {

        Node newNode = new Node(product);
        if (newNode == null) {
            return false;
        }


        if (head == null) {
            head = newNode;
            return true;
        }

        Node temp = head;
        if(head.getProduct() == product) {
            return false;
        }
        while (temp.getNext() != null) {
            temp = temp.getNext();
            if(temp.getProduct() == product) {
                return false;
            }
        }

        temp.setNext(newNode);
        return true;
    }

  
    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.getProduct() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
