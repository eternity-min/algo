// Time Limit Exceed : 60
package jungol.q1332;

import java.util.Scanner;

public class Min1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		int N = S.length();
		StringBuilder Answer = new StringBuilder();

		for (int i = 1; i < N; i++) {
			if (S.startsWith(S.substring(N - i, N))) {
				Answer.append(i);
				Answer.append(" ");
			}
		}

		System.out.println(Answer.toString() + N);
	}
}