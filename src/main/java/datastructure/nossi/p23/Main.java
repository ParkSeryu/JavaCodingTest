package datastructure.nossi.p23;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static class Solution {

        public static int solution(int[] prices, int target) {
            Arrays.sort(prices);
            int l = 0;
            int r = prices.length - 1;
            int answer = 0;

            while(l < r){
                if(prices[l] + prices[r] == target){
                    answer++;
                    l++;
                    r--;
                } else if(prices[l] + prices[r] < target){
                    l++;
                } else {
                    r--;
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
