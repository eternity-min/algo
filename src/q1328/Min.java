package q1328;

import java.util.Scanner;

public class Min {
    // Accept
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] buildings = new int[N];
        int[] answer = new int[N];
        int current = 0;

        for (int i = 0; i < N; i++) {
            buildings[i] = s.nextInt();

            if (i != 0 && buildings[i] > buildings[i - 1]) {
                for (int j = current; j < i; j++) {
                    if (buildings[i] > buildings[j]) {
                        answer[j] = i + 1;
                    }
                }
                current = i;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(answer[i]);
        }
    }
}