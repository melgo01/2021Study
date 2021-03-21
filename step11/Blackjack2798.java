package step11;

import java.util.Scanner;

public class Blackjack2798 {

	
	public static int blackjack(int max, int[] array) {
		int sum=0;
		int best=0;
		for(int j=0; j<array.length-2; j++) {
			for(int k=j+1; k<array.length-1; k++) {
				for(int l=k+1; l<array.length; l++) {
					sum = array[j] + array[k] + array[l];
					if(sum==max) {
						return sum;
					} //if end
					if(sum<max && sum>best) best = sum;
				} //l end
			} //k end
		} //j end	
		return best;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] x = new int[N];
		for(int i=0; i<x.length; i++) {
			x[i] = sc.nextInt();
		}
		
		System.out.println( blackjack(M, x) );
		
		sc.close();
	} //main end
	
} //class end
