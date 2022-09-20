package Algorithm_test;

import java.util.Scanner;

public class B2609 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int a = scan.nextInt();
		int b = scan.nextInt();

		int min = (a < b ? a : b);
		
		int[] restZero = new int[min];
		int cnt = 0;
		for (int i = 1; i <= min; i++) {
			if (min % i == 0) {
				restZero[cnt] = i;
				cnt++;
			}
		}
		
	}

}
