package org.problems.example8;

import java.util.Scanner;

public class Example8_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int n = 0;
		
		while (true) {

			if (c <= b) {
				System.out.println(-1);
				break;
			}
			
			else if (a/(c-b) >= n) {
				n++;
			}
			
			else if (a/(c-b) < n) {
				System.out.println(n);
				break;
			}
			
		}
	}
}
