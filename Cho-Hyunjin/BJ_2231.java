package java_problems;

import java.util.Scanner;

public class BJ_2231 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			int n = i;
			int sum = 0;
			
			while(n != 0) {
				sum += n % 10;
				n /= 10;
			}
			
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
