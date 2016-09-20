package jungol.q1328;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] buildings = new int[N][2];
        int current = 0;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            buildings[i][0] = s.nextInt();

            if (i != 0 && buildings[i][0] > buildings[i - 1][0]) {
                for (int j = current; j < i; j++) {
                    if (buildings[i][0] > buildings[j][0]) {
                        buildings[j][1] = i + 1;
                    }
                    else {
                        buildings[j][1] = i;
                        list.add(j);
                    }
                }

                current = i;
            }
        }

        for (int item : list) {

        }

        for (int i = 0; i < N; i++) {
            System.out.println(buildings[i][1]);
        }
    }

}