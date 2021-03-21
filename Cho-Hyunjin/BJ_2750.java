package java_problems;

import java.util.Scanner;

public class BJ_2750 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] < arr[j]) {
					int t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
		}
		
		for(int val : arr) {
			System.out.println(val);
		}
	}

}
