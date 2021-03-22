package org.problems.example7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example7_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		String[] array = s.split(" ");
		
		char[] arr1 = array[0].toCharArray();
		char[] arr2 = array[1].toCharArray();
		
		if (arr1[2] == arr2[2]) {
			if (arr1[1] == arr2[1]) {
				if (arr1[0] > arr2[0]) {
					System.out.println(arr1[2]+arr1[1]+arr1[0]);
				} else {
					System.out.println(arr2[2]+arr2[1]+arr2[0]);
				}
			} else if (arr1[1] > arr2[1]) {
				System.out.println(arr1[2]+arr1[1]+arr1[0]);
			} else if (arr1[1] < arr2[1]) {
				System.out.println(arr2[2]+arr2[1]+arr2[0]);
			}
		} else if (arr1[2] > arr2[2]) {
			System.out.println(arr1[2]+arr1[1]+arr1[0]);
		} else if (arr1[2] < arr2[2]) {
			System.out.println(arr2[2]+arr2[1]+arr2[0]);
		}
		}

	}

