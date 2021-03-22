package org.problems.example9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example9_10 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		double n = Double.parseDouble(bf.readLine());
		
		System.out.printf("%6f\n", n*n*Math.PI);
		System.out.printf("%6f", n*n*2);
		
		
	}

}
