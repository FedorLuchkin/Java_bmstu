package lab6_var1_8;

import java.util.Stack;

public class Main {
    public static boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            } else if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            } else if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "([]{()})";
        if (checkBrackets(input)) {
            System.out.println("Скобки расставлены правильно.");
        } else {
            System.out.println("Ошибка в расстановке скобок.");
        }

        input = "{([]{()}){}";
        if (checkBrackets(input)) {
            System.out.println("Скобки расставлены правильно.");
        } else {
            System.out.println("Ошибка в расстановке скобок.");
        }
    }
}
