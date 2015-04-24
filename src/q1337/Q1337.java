package q1337;
import java.util.Scanner;

public class Q1337 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                sc.close();

                int triangle[][] = new int[N][N];
                int pos[] = new int[2];
                pos[0] = -1;
                pos[1] = -1;

                int number = 0;
                int count = N;
                int type = 1;

                while (true) {
                        if (count == 0) break;
                        
                        for (int i = 0; i < count; i++) {
                        	if (number >= 10) number = 0;
                        	if (type % 3 == 1) {	 pos[0]++; pos[1]++; }	// �밢��
                        	else if (type % 3 == 2) pos[1]--;				// ����
                        	else if (type % 3 == 0) pos[0]--;				// ����
                        	triangle[pos[0]][pos[1]] = number++;
                        }
                        count--; type++;
                }

                for (int i = 0; i < N; i++) {
                        for (int j = 0; j <= i; j++) {
                                System.out.print(triangle[i][j] + " ");
                        }
                        System.out.println();
                }
        }

}