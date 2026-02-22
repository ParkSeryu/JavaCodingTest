package datastructure.nossi.p25;

import java.io.IOException;
import java.util.Stack;

public class Main {

    static class Solution {

        public static int solution(String s) {
            int answer = 0;
            Stack<Character> stack = new Stack<>();
            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    stack.push(')');
                } else if (ch == '[') {
                    stack.push(']');
                } else if (ch == '{') {
                    stack.push('}');
                } else {
                    if (stack.isEmpty() || stack.peek() != ch) {
                        return -1;
                    } else if (stack.peek() == ch) {
                        stack.pop();
                        answer++;
                    }
                }
            }

            return stack.isEmpty() ? answer : -1;
        }
    }

    public static void main(String[] args) throws IOException {
        String input = "()[]{}";
        int result = Solution.solution(input);

        System.out.println(result);
    }
}
