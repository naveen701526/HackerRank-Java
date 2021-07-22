package src;

import java.util.*;

// problem statement: https://www.hackerrank.com/challenges/java-stack/problem?h_r=next-challenge&h_r=next-challenge&h_r=next-challenge&h_r=next-challenge&h_r=next-challenge&h_v=zen&h_v=zen&h_v=zen&h_v=zen&h_v=zen&isFullScreen=false

public class JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            Stack<Character> stacky = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stacky.isEmpty()) {
                    switch (input.charAt(i)) {
                        case '}':
                            if (stacky.peek() == '{') {
                                stacky.pop();
                            }
                            break;
                        case ']':
                            if (stacky.peek() == '[') {
                                stacky.pop();
                            }
                            break;
                        case ')':
                            if (stacky.peek() == '(') {
                                stacky.pop();
                            }
                            break;
                        default:
                            stacky.push(input.charAt(i));
                    }
                } else {
                    stacky.push(input.charAt(i));
                }
            }
            System.out.println(stacky.isEmpty());
        }

        scanner.close();
    }
}
