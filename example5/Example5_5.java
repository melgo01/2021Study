package org.problems.example5;
import java.util.Scanner;

public class Example5_5 {
	
	public static double NewScore(double a, double max) {
		return (a/max*100);
	}
	
	public static void avg (double[] array) {
		double sum=0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		System.out.println(sum/array.length);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		double[] array = new double[n];
		
		for (int i=0; i<n; i++) {
			array[i] = sc.nextDouble();
		}
		
		double max = array[0];
		
		for (int i=1; i<n; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		for (int i=0; i<n; i++) {
			array[i] = NewScore(array[i], max);
		}
		
		avg(array);

	}

}
