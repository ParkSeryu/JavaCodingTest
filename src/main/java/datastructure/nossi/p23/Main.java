package datastructure.nossi.p23;

import java.io.*;
import java.util.*;

public class Main {

    static class Solution {

        public static int solution(int[] prices, int target) {
            int answer = 0;
            HashSet<Integer> hashSet = new HashSet<>();

            for(int i = 0; i < prices.length; i++){
                if(hashSet.contains(target - prices[i])){
                    answer++;
                }else{
                    hashSet.add(prices[i]);
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
