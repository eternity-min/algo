package q1998;

import java.util.Scanner;

public class MainP1998 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        String string = s.nextLine();
        String[] strings = string.split(" ");

        int max = 0;
        int desc = 1;
        int asc = 1;

        for (int i = 1; i < N; i++) {
            if (Integer.parseInt(strings[i]) == Integer.parseInt(strings[i - 1])) {
                asc++;
                desc++;
            }
            else if (Integer.parseInt(strings[i]) > Integer.parseInt(strings[i - 1])) {
                max = max > desc ? max : desc;
                asc++;
                desc = 1;
            }
            else {
                max = max > asc ? max : asc;
                asc = 1;
                desc++;
            }
        }

        max = max > asc ? max : asc;
        max = max > desc ? max : desc;

        System.out.println(max);
    }

    public static void main2(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        String string = s.nextLine();
        int max = 0;
        int desc = 1;
        int asc = 1;

        for (int i = 2; i < N * 2 - 1; i += 2) {
            if (string.charAt(i) == string.charAt(i - 2)) {
                asc++;
                desc++;
            }
            else if (string.charAt(i) > string.charAt(i - 2)) {
                max = max > desc ? max : desc;
                asc++;
                desc = 1;
            }
            else {
                max = max > asc ? max : asc;
                asc = 1;
                desc++;
            }
        }

        max = max > asc ? max : asc;
        max = max > desc ? max : desc;

        System.out.println(max);
    }

    public static void main1(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        String string = s.nextLine();
        int max = 0;
        int desc = 1;
        int asc = 1;

        for (int i = 2; i < N * 2 - 1; i += 2) {
            if (string.charAt(i) >= string.charAt(i - 2)) {
                asc++;
                max = max > asc ? max : asc;
            }
            else {
                asc = 1;
            }

            if (string.charAt(i) <= string.charAt(i - 2)) {
                desc++;
                max = max > desc ? max : desc;
            }
            else {
                desc = 1;
            }
        }
        max = max > asc ? max : asc;
        max = max > desc ? max : desc;

        System.out.println(max);
    }
}