package org.problems.example5;

import java.util.Scanner;

public class Bj_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for (int i=0; i<c; i++) {
			int n = sc.nextInt();
			double sum = 0;
			int cnt = 0;
			int[] arr = new int[n];
			for (int j=0; j<n; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			double avg = sum / n;
			for (int k=0; k<n; k++) {
				if (arr[k] > avg) cnt++;
			}
			System.out.printf("%.3f%%\n",100.0*cnt/n);
		}
		
		sc.close();
	}

}
