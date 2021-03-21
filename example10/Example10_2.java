package org.problems.example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example10_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		System.out.println(fibo(n));
	}
	
	public static int fibo(int i) {
		if (i <= 1)
			return i;
		else 
			return fibo(i-2)+fibo(i-1);
	}

}
