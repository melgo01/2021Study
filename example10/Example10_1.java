package org.problems.example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example10_1 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int fac=1;
		
		for(int i = n; i>0; i--) {
			fac = fac*i;
		}
		
		System.out.println(fac);
	}

}
