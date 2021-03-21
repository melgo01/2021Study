package org.problems.example9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example9_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s1 = bf.readLine();
		String s2 = bf.readLine();
		String s3 = bf.readLine();
		
		String[] arr1 = s1.split(" ");
		String[] arr2 = s2.split(" ");
		String[] arr3 = s3.split(" ");
		
		int a1 = Integer.parseInt(arr1[0]);
		int b1 = Integer.parseInt(arr1[1]);
		int a2 = Integer.parseInt(arr2[0]);
		int b2 = Integer.parseInt(arr2[1]);
		int a3 = Integer.parseInt(arr3[0]);
		int b3 = Integer.parseInt(arr3[1]);
		
		int n1 = 0;
		int n2 = 0;
		
		if (a1 == a2) n1 = a3;
		else if (a1 == a3) n1 = a2;
		else if (a2 == a3) n1 = a1;
		
		if (b1 == b2) n2 = b3;
		else if (b1 == b3) n2 = b2;
		else if (b2 == b3) n2 = b1;
		
		System.out.println(n1+" "+n2);
		
	}

}
