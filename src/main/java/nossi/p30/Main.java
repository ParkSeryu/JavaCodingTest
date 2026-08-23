package nossi.p30;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static int answer = 0;

    static class Solution {
        public static int solution(int balance, int[][] countries) {
            int n = countries.length;
            boolean[] visited = new boolean[n];
            answer = 0;

            dfs(balance, 0, countries, visited);

            return answer;
        }

        static void dfs(int balance, int count, int[][] countries, boolean[] visited) {
            answer = Math.max(answer, count);

            for(int i = 0; i < countries.length; i++){
                if(!visited[i] && balance >= countries[i][1]){
                    visited[i] = true;
                    dfs(balance - countries[i][0], count + 1, countries, visited);
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int balance = 600;
        int[][] countries = {
                {70, 350},
                {100, 550},
                {350, 400}
        };
        System.out.println(Solution.solution(balance, countries));
    }
}
