package org.problems.example5;
import java.util.Scanner;

public class Example5_2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[] array = new int[9];
		 
		 for(int i=0; i<9; i++) {
			 array[i] = sc.nextInt();
		 }
		 
		 int max = array[0];
		 
		 for (int k=0; k<9; k++) {
			 if(max<array[k]) {
				 max = array[k];
			 }
		 }
		 
		 System.out.println(max);
		 System.out.println(search(array,max));

	}
	
	static int search(int array[], int max) {
		int j;
		
		for(j=0; j<array.length; j++) 
			if (array[j]==max)
				return j+1;
		
		return -1;
	}

}
