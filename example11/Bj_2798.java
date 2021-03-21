package org.problems.example11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj_2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		
		String[] arr1 = s1.split(" ");
		String[] arr2 = s2.split(" ");
		
		int n = Integer.parseInt(arr1[0]);
		int m = Integer.parseInt(arr1[1]);
		
		int[] arr = new int[n];
		
		for (int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(arr2[i]);
		}
		
		Arrays.sort(arr); // sort가 됨!
		
		while (true) {
			for (int i=0; i<n; i++) {
				if (arr[n-i] + arr[n-i-1] + arr[n-i-2] == m) {
					System.out.println(m);
				}
			}
		}
		
	

	}

}
