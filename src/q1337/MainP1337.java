package q1337;
import java.util.Scanner;

public class MainP1337 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        String[][] answer = new String[n][n];
        
        int value = 0;
        int loop = 0;
        int x = 0;
        int y = 0;
        
        while(loop < n) {
            for(int i = 0; i < n - loop; i++) {
                answer[x][y] = String.valueOf(value++ % 10);
                if(i + 1 == n - loop) {
                    break;
                }
                x++;
                y++;
            }
            y--;
            loop++;
            
            for(int i = 0; i < n - loop; i++) {
                answer[x][y] = String.valueOf(value++ % 10);
                if(i + 1 == n - loop) {
                    break;
                }
                y--;
            }
            x--;
            loop++;
            
            for(int i = 0; i < n - loop; i++) {
                answer[x][y] = String.valueOf(value++ % 10);
                if(i + 1 == n - loop) {
                    break;
                }
                x--;
            }
            x++;
            y++;
            loop++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((j == 0 ? "" : " ") + (answer[i][j] == null ? " " : answer[i][j]));
            }
            System.out.println();
        }
    }
}