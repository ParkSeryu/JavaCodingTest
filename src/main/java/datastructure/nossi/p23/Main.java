package datastructure.nossi.p23;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static class Solution {

        public static int solution(int[] prices, int target) {
            int answer = 0;

            for(int i = 0; i < prices.length; i++){
                for(int j = i + 1; j < prices.length; j++){
                    if(prices[i] + prices[j] == target){
                        answer++;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) throws IOException {
        int[] prices = {4, 1, 9, 7, 5, 3, 16};
        int target = 14;
//        int[] prices = {2, 1, 5, 7};
//        int target = 4;

        int result = Solution.solution(prices, target);

        System.out.println(result);
    }
}
