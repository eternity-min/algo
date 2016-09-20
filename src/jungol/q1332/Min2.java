// Time Limit Exceed : 70
package jungol.q1332;

import java.util.Scanner;

public class Min2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		int N = S.length();

		for (int i = 1; i < N; i++) {
			if(S.charAt(0) != S.charAt(N - i) || S.charAt(i - 1) != S.charAt(N - 1)) {
				continue;
			}
			
			if (S.startsWith(S.substring(N - i, N))) {
				System.out.print(i);
				System.out.print(" ");
			}
		}

		System.out.println(N);
	}
}