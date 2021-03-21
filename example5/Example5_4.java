package org.problems.example5;
import java.util.Scanner;

public class Example5_4 {
	
	public static int returnrest(int a) {
		return a%42;		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int[] rest =  new int[42];
		
		for (int i=0; i<10; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i=0; i<10; i++) {
			rest[returnrest(array[i])]++;
				}
		
		int count=0;
		for (int i=0; i<42; i++) {
			if (rest[i] != 0) count++;
			}
		
		System.out.println(count);
				
		
					
		}
					
				
		
		}
		
		
		
