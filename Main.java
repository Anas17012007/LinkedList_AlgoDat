public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.show(); 
        list.size();
        System.out.println();
        list.deleteHead();
        list.show(); 
        list.size();
        System.out.println();
        list.deleteTail();
        list.show(); 
        list.size();
        System.out.println();
        list.isContains(0);
        list.isContains(2);
        System.out.println();
        list.insertAtHead(5);
        list.show();
        list.size();
        System.out.println();
        list.deleteHead();
        list.show();
        System.out.println();
        list.insertAtHead(5);
        list.deleteTail();
        list.show();
    }
}
