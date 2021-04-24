package org.problems.example6;

public class Bj_4673 {

	public static void main(String[] args) {
		int n = 1;
		int[] arr = new int[10001];
		
		for (int i = 1; i<arr.length; i++) {
			n = i;
			int sum = n;
			int a = n / 10000;
			n %= 10000;
			int b = n / 1000;
			n %= 1000;
			int c = n / 100;
			n %= 100;
			int d = n / 10;
			int e = n % 10;
			sum = sum + a + b + c + d + e;
			if (sum > 10000) break;
			arr[sum] += 1;
		}
		
		for (int i=1; i<9994; i++) {
			if (arr[i] == 0) System.out.println(i);
		}
	}

}
