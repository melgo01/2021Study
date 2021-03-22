package org.problems.example5;

import java.util.Scanner;

public class Example5_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr;
		int bonus, sum;
		
		for (int i=0; i<n; i++) {
			bonus = 0;
			sum = 0;
			arr = sc.next().toCharArray();
			for (int j=0; j<arr.length; j++) {
				if (arr[j] == 'O') {
					bonus++;
					sum+=bonus;
				} else bonus = 0;
			}
		
			System.out.println(sum);
		}
	

	}

}