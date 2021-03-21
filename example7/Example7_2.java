package org.problems.example7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example7_2 {

	public static void main(String[] ar) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		
		char[] arr1 = s.toCharArray();
		
		int[] arr2 = new int[n];
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			arr2[i] = Character.getNumericValue(arr1[i]);
			sum += arr2[i];
		}
		System.out.println(sum);
	}

}
