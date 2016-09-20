package acmicpc.q2579;

import java.util.Scanner;

/**
 * Created by hope on 2016. 9. 6..
 * https://www.acmicpc.net/problem/2579
 */
public class MainP2579 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int N = S.nextInt();
        int[] DATA = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            DATA[i] = S.nextInt();
        }

        int[][] dp = new int[N + 1][3];
        dp[1][1] = dp[1][2] = DATA[1];

        for (int i = 2; i <= N; i++) {
            dp[i][1] = DATA[i] + dp[i - 1][2];
            dp[i][2] = DATA[i] + Math.max(dp[i - 2][1], dp[i - 2][2]);
        }

        System.out.println(Math.max(dp[N][1], dp[N][2]));
    }
}
