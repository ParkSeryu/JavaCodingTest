package datastructure.nossi.p26;

import java.io.IOException;
import java.util.Stack;

public class Main {

    static class Solution {

        public static int[] solution(int[] weights) {
            int[] answer = new int[weights.length];

            for(int i = 0; i < weights.length - 1; i++){
                int cnt = 0;
                for(int j = i + 1; j < weights.length; j++){
                    cnt++;
                    if(weights[i] < weights[j]){
                        answer[i] = cnt;
                        break;
                    }
                }
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
