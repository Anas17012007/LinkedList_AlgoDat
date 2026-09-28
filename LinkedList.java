class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }   
}
class LinkedList {
    Node head;
    Node tail;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void deleteHead() {
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }
    public void deleteTail() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }
    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Size of the linked list: " + count);
    }
    public void isContains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println(data + " is present in the linked list.");
                return;
            }
            current = current.next;
        }
        System.out.println(data + " is not present in the linked list.");
    }
}
