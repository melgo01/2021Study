package org.problems.example6;
import java.util.Scanner;

public class Test {
	long sum (int[] a) {
		long sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}

public class Example6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[array.length];
		
		for (int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		Test sum = new Test();
		System.out.println(sum.sum(array));

	}
}
