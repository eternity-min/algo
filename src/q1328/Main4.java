package q1328;

import java.util.Scanner;

public class Main4 {
    // Time limit Exceed
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] buildings = new int[N];
        int[] answer = new int[N];
        int current = 0;
        boolean exist = false;

        for (int i = 0; i < N; i++) {
            buildings[i] = s.nextInt();

            if (i != 0 && buildings[i] > buildings[i - 1]) {
                exist = false;
                for (int j = current; j < i; j++) {
                    if (answer[j] != 0) continue;

                    if (buildings[i] > buildings[j]) {
                        answer[j] = i + 1;
                    }
                    else {
                        exist = true;
                    }
                }
                if (!exist) {
                    current = i;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(answer[i]);
        }
    }
}