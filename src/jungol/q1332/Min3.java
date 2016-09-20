// Time Limit Exceed : 10
package jungol.q1332;

import java.util.Scanner;

public class Min3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		int N = S.length();
		boolean equals = false;

		for (int i = 1; i < N; i++) {
			equals = true;
			for (int j = 0; j < i; j++) {
				if (S.charAt(j) != S.charAt(N - i + j)) {
					equals = false;
					break;
				}
			}

			if (equals) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(i);
			}
		}

		System.out.print(N);
	}
}