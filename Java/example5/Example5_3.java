package org.problems.example5;
import java.util.Scanner;

public class Example5_3 {

	public static void main(String[] args) {
		int case1=0, case2=0, case3=0, case4=0, case5=0, case6=0, case7=0, case8=0, case9=0, case0=0;
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4];
		
		for(int i=0; i<3; i++) {
			array[i] = sc.nextInt();
		}
		array[3] = array[1]*array[2]*array[3];
		
		for(int k=0; k<4; k++) {
		switch (array[k]) {
		case 0: case0++;
		case 1: case1++;
		case 2: case2++;
		case 3: case3++;
		case 4: case4++;
		case 5: case5++;
		case 6: case6++;
		case 7: case7++;
		case 8: case8++;
		case 9: case9++;
		break;
		}
		
		System.out.println()
			
		}

	}

}
