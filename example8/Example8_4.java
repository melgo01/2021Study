package org.problems.example8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example8_4 {

	public static void main(String[] input) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		input = bf.readLine().split(" ");
		double a = Integer.parseInt(input[0]);
		double b = Integer.parseInt(input[1]);
		double c = Integer.parseInt(input[2]);
		
		double n = Math.ceil((c-b)/(a-b));
		System.out.println((int) n);
	}

}
