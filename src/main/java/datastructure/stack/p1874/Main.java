package datastructure.stack.p1874;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int[] arr = new int[n];

        // 입력 미리 전부 읽기
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = sc.nextInt();
        }

        int i = 1;      // push할 숫자
        int idx = 0;    // arr 인덱스
        int su = arr[idx];

        while (i <= n) {
            Integer peek = stack.peek();
            if (peek != null && su == peek) {
                stack.pop();
                sb.append("-\n");
                idx++;
                if (idx < n) su = arr[idx];
            } else {
                stack.push(i);
                sb.append("+\n");
                i++;
            }
        }

        // 남은 스택 비우기
        while (!stack.isEmpty()) {
            if (stack.pop() != su) {
                System.out.println("NO");
                return;
            }
            sb.append("-\n");
            idx++;
            if (idx < n) su = arr[idx];
        }

        // 마지막 출력
        System.out.print(sb.toString());
    }
}
