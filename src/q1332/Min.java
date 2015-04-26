// Time Limit Exceed : 60
package q1332;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Min {
	public static void main(String[] args) throws Exception {
		//Scanner s = new Scanner(System.in);
		Scanner s = new Scanner(new File("c:\\Users\\FDC9936\\Desktop\\test1332.txt"));
		String S = s.nextLine();
		int N = S.length();
		Date date = new Date();
		
		for (int i = 1; i < N; i++) {
			if(S.charAt(0) != S.charAt(N - i) || S.charAt(i - 1) != S.charAt(N - 1)) {
				continue;
			}
			
			if (S.startsWith(S.substring(N - i, N))) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
		System.out.println(new Date().getTime() - date.getTime());
		System.out.print(N);
	}
}