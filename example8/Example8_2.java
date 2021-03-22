package org.problems.example8;

import java.util.Scanner;

public class Example8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=1;
		
		int c = sc.nextInt();
		
		while (true) {
			if (c <= 3*n*n - 3*n +1) break;
			n++;
		}
		
		System.out.println(n);
	}

}
