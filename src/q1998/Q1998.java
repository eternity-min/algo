package q1998;
import java.util.Scanner;

public class Q1998 {

	public static void main1(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int numbers[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		
		int maxCnt = 1;
		int increaseCnt = 1;
		int decreaseCnt = 1;
		
		boolean isIncrease = true;
		boolean isDecrease = true;
		boolean isEqual = false;
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i - 1] < numbers[i]) {		// ���� ����
				if (isIncrease || isEqual)	increaseCnt++;
				if (isDecrease && isEqual)	decreaseCnt = 1;				
				if (isDecrease && !isEqual) {
					increaseCnt = 2;
					decreaseCnt = 1;
				}
				isIncrease = true;
				isDecrease = false;
				isEqual = false;
			}
			if (numbers[i - 1] > numbers[i]) {		// ���� ����
				if (isDecrease || isEqual)	decreaseCnt++;
				if (isIncrease && isEqual)	increaseCnt = 1;
				if (isIncrease && !isEqual) {
					decreaseCnt = 2;
					increaseCnt = 1;
				}
				isDecrease = true;
				isIncrease = false;
				isEqual = false;
			}
			if (numbers[i-1] == numbers[i]) {		// ���� ���� 
				isEqual = true;
				decreaseCnt++;
				increaseCnt++;
			}
			
			if (maxCnt < increaseCnt)	maxCnt = increaseCnt;
			if (maxCnt < decreaseCnt)	maxCnt = decreaseCnt;
		}
		
		System.out.println(maxCnt);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int numbers[] = new int[N];
		
		int maxCnt = 1;
		int increaseCnt = 1;
		int decreaseCnt = 1;
		
		boolean isIncrease = true;
		boolean isDecrease = true;
		boolean isEqual = false;		
		
		for (int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
			
			if (i > 0) {
				if (numbers[i - 1] < numbers[i]) {		// ���� ����
					if (isIncrease || isEqual)			increaseCnt++;
					if (isDecrease && isEqual)		decreaseCnt = 1;				
					if (isDecrease && !isEqual) 	{ increaseCnt = 2; decreaseCnt = 1;}
					isIncrease = true; isDecrease = false; isEqual = false;
				}
				if (numbers[i - 1] > numbers[i]) {		// ���� ����
					if (isDecrease || isEqual)		decreaseCnt++;
					if (isIncrease && isEqual)		increaseCnt = 1;
					if (isIncrease && !isEqual) 		{ decreaseCnt = 2; increaseCnt = 1;}
					isIncrease = false; isDecrease = true; isEqual = false;
				}
				if (numbers[i-1] == numbers[i]) {		// ���� ���� 
					decreaseCnt++; increaseCnt++;
					isEqual = true;
				}
				
				if (maxCnt < increaseCnt)	maxCnt = increaseCnt;
				if (maxCnt < decreaseCnt)	maxCnt = decreaseCnt;				
			}
		}
		sc.close();
		
		System.out.println(maxCnt);
	}	

}
