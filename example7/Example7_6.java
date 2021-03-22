package org.problems.example7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Example7_6 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		String[] array = s.split(" ");
		
		// System.out.println(s);
		System.out.println(array.length);

		}

	}