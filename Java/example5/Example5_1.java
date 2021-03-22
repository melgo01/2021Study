package org.problems.example5;

import java.util.Scanner;

public class Example5_1 {
	
	public static void main(String[] args) {
		
		// 배열 생성
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number_size = n;
		int[] number = new int[number_size];
		
		// 입력된 숫자를 순서에 맞게 저장
		for (int i=0; i<n; i++) {
			number[i] = sc.nextInt();
		}
		
		int max = number[0];
		int min = number[0];
		
		for (int l=0; l< number.length; l++) {
			if(max<number[l]) {
				max = number[l];
			}
			
			if(min>number[l]) {
				min = number[l];
			}
		}
		
		System.out.println(min+" "+max);
		}
	}

