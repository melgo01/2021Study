package step12;

import java.util.Scanner;

public class J2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<a.length; i++) a[i]=sc.nextInt();
		
		//select sort
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(a[i]>a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		} //for end
		
		for(int x : a) System.out.println(x);
		sc.close();

	}

}
