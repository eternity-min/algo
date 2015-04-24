package q1328;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    // Time limit Exceed
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] buildings = new int[N];
        int[] answer = new int[N];
        int current = 0;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            buildings[i] = s.nextInt();

            int size = list.size();
            for (int j = size - 1; j >= 0; j--) {
                if (buildings[i] > buildings[list.get(j)]) {
                    answer[list.get(j)] = i + 1;
                    list.remove(j);
                }
            }

            if (i != 0 && buildings[i] > buildings[i - 1]) {
                for (int j = current; j < i; j++) {
                    if (buildings[i] > buildings[j]) {
                        answer[j] = i + 1;
                    }
                    else {
                        list.add(j);
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