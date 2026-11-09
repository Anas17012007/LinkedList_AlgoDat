public class InfixToPostfix {

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static String convert(String infix) {
        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (isOperand(c)) {
                result += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                if (stack.isEmpty()) {
                    throw new RuntimeException("Kurung tidak seimbang!");
                }
                stack.pop(); // buang '('
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && stack.peek() != '('
                        && (precedence(stack.peek()) > precedence(c)
                        || (precedence(stack.peek()) == precedence(c) && c != '^'))) {
                    result += stack.pop();
                }
                stack.push(c);
            } else {
                throw new RuntimeException("Karakter tidak valid: " + c);
            }
        }

        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '(') {
                throw new RuntimeException("Kurung tidak seimbang!");
            }
            result += top;
        }

        return result;
    }
}
