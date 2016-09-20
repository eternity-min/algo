package jungol.q1338;
import java.util.Scanner;

public class MainP1338 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String[][] answer = new String[n][n];
        char a = 'Z';

        for (int k = 0; k < n; k++) {
            for (int i = k; i < n; i++) {
                answer[i][n - 1 - i + k] = String.valueOf( a >= 'Z' ? a = 'A' : ++a);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((j == 0 ? "" : " ") + (answer[i][j] == null ? " " : answer[i][j]));
            }
            System.out.println();
        }
    }
}