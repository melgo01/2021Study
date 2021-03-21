package step11;

import java.util.Scanner;

public class Trial {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] x;
			x = new int[N];
			for(int i=0; i<N; i++) {
				x[i] = sc.nextInt();
				System.out.println(x[i]);
			}
		}
}
