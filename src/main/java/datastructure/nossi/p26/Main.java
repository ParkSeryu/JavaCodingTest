package datastructure.nossi.p26;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    static class Solution {

        public static int[] solution(int[] weights) {
            int[] answer = new int[weights.length];
            Deque<int[]> stack = new ArrayDeque<>();

            for(int i = 0; i < answer.length; i++){
                int weight = weights[i];
                while(!stack.isEmpty() && stack.peek()[1] < weight){
                    int prevInfo[] = stack.pop();
                    int index = prevInfo[0];
                    answer[index] = i - index;
                }
                stack.push(new int[]{i, weight});
            }

            return answer;
        }
    }

    public static void main(String[] args) throws IOException {
        int[] input = {25, 23, 31, 28, 25, 25, 27, 29};
        int[] result = Solution.solution(input);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
