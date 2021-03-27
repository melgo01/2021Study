package java_problems;

import java.util.Scanner;

public class BJ_2798 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		int R = search(arr, N, M);
		System.out.println(R);
	}

	static int search(int[] arr, int N, int M) {
		int R = 0;
		
		for (int i = 0; i < N-2; i++) {
			
			for (int j = i + 1; j < N - 1; j++) {
				
				for (int k = j+1; k < N; k++) {
					
					int sum = arr[i] + arr[j] + arr[k];
					
					if  (M == sum) {
						return sum;
					}
					if(R < sum && sum < M) {
						R = sum;
					}
				}
			}
		}
		return R;
	}
}
