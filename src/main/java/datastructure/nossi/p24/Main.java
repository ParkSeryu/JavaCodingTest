package datastructure.nossi.p24;

import java.io.IOException;
import java.util.HashSet;
import java.util.Stack;

public class Main {

    static class Solution {

        public static int solution(String s) {
            int answer = 0;
            Stack<String> stack = new Stack<>();
            char[] charArray = s.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == '(') {
                    stack.push(String.valueOf(charArray[i]));
                } else {
                    if(stack.isEmpty()){
                        answer = -1;
                        break;
                    }
                    stack.pop();
                    answer++;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) throws IOException {
        String input = "(()())()";
        int result = Solution.solution(input);

        System.out.println(result);
    }
}
