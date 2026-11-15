class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node newHead) {
        head = newHead;
        tail = head;
        if (tail != null) {
            while (tail.next != null) {
                tail = tail.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public LinkedList copy() {
        LinkedList c = new LinkedList();
        Node current = head;
        while (current != null) {
            c.addLast(current.value);
            current = current.next;
        }
        return c;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}