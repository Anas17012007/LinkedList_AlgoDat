public class Main {
    public static void main(String[] args) {
        // Demo Stack
        System.out.println("=== Demo Stack ===");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Peek : " + stack.peek());
        System.out.println("Pop  : " + stack.pop());
        stack.display();
        System.out.println("Size : " + stack.size());

        // Demo Infix -> Postfix
        System.out.println("\n=== Infix ke Postfix ===");
        String[] tests = {
            "A+B*C",
            "(A+B)*C",
            "A+B*C-D/E",
            "A^B^C",
            "(A+B)*(C-D)/E"
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Infix  : " + tests[i]);
            System.out.println("Postfix: " + InfixToPostfix.convert(tests[i]));
            System.out.println();
        }
    }
}
