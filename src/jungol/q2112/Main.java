package jungol.q2112;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hope on 2016. 9. 20..
 * 참조 : http://m.blog.naver.com/dldbdgml99/220002222967
 */
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int N = S.nextInt();

        int[] DP = new int[N+1];
        int sum = 0;

        DP[0] = 1;
        DP[1] = 0;

        for(int i = 2; i <= N; i += 2) {
            DP[i] = DP[i - 2] * 3 + sum * 2;
            sum += DP[i - 2];

            //System.out.println(i + " : " + Arrays.toString(DP));
        }

        System.out.println(DP[N]);

    }
}