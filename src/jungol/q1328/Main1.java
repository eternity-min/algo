package jungol.q1328;

import java.util.Scanner;

public class Main1 {

    // Time limit Exceed
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] buildings = new int[N];
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            buildings[i] = s.nextInt();

            for (int j = 0; j < i; j++) {
                if (buildings[i] > buildings[j]) {
                    if (answer[j] == 0) {
                        answer[j] = i + 1;
                    }
                }
            }
        }

        for (int item : answer) {
            System.out.println(item);
        }
    }
}