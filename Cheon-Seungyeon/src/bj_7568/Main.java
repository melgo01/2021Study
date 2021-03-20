package bj_7568;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int[] arrx = new int[n];
		int[] arry = new int[n];
		for(int i=0;i<n;i++) {
			arrx[i] = sc.nextInt();
			arry[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arrx[i]<arrx[j]&&arry[i]<arry[j]) {
					s[i]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.printf("%d ", s[i]+1);
		}
	}

}
