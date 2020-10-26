package task2;

import java.util.Stack;

public class SymmetricallyChecker {

    public boolean check(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (symbol == '(' || symbol == '[' || symbol == '{') {
                stack.push(symbol);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char symbolFromStack = stack.pop();
            switch (symbol) {
                case ')':
                    if (symbolFromStack == '[' || symbolFromStack == '{') {
                        return false;
                    }
                    break;

                case ']':
                    if (symbolFromStack == '(' || symbolFromStack == '{') {
                        return false;
                    }
                    break;

                case '}':
                    if (symbolFromStack == '[' || symbolFromStack == '(') {
                        return false;
                    }
                    break;
            }

        }
        return (stack.isEmpty());
    }

}
