package step12;

import java.util.Scanner;
import java.util.Arrays;

public class Sortinside1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.nextLine().toCharArray();
		Arrays.sort(a);
		for(int i=a.length-1; i>=0; i--) System.out.print(a[i]);
		sc.close();
		
	}

}
