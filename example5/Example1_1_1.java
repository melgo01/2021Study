package org.problems.example5;
import java.util.Scanner;

public class Example1_1_1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] score = new int[i];
		double total = 0.0;
		int Max=0;
		
		for(int j=0;j<i;j++) {
			score[j]=sc.nextInt();
			
			if(score[j]>Max) {
				Max = score[j];
			}
			
			}
	
		/*for(int k=0;k<i;k++) {
			total += score[k];
		}*/
			
			for(double a:score) {
				total+=a/Max*100;
				System.out.println(total);
			} // 왜 배열이 다 출력이 되는지..?

		 System.out.println((double)total/3);
		
		
		
}
}