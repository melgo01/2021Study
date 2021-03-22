package org.problems.example9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Example9_9 {

	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String s = bf.readLine();
			String[] arr = s.split(" ");
			
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int c = Integer.parseInt(arr[2]);
			
			if (a+b+c==0) break;
			
			int array[] = {a, b, c};
			
			int max = array[0];
			
			Arrays.sort(array);
			
			if ((array[2])*(array[2]) == (array[0])*(array[0])+(array[1])*(array[1])) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
				
		}

	}

}
