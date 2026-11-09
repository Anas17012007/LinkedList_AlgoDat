public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        System.out.println("=== Demo Queue ===");
        queue.enqueue("Andi");
        queue.enqueue("Budi");
        queue.enqueue("Citra");
        queue.display();

        System.out.println("Peek    : " + queue.peek());
        System.out.println("Dequeue : " + queue.dequeue());
        queue.display();

        queue.enqueue("Dewi");
        queue.display();
        System.out.println("Size    : " + queue.size());
        System.out.println("Kosong? : " + queue.isEmpty());
    }
}
