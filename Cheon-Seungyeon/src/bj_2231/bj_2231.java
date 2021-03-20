package bj_2231;
import java.util.Scanner;
public class bj_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maker=0;
		for(int i = 1;i<n;i++) {
			int sum =i;
			if(i==i%10) {
				sum=i;
			 }else {
				 while(i!=0) {
						sum+=i%10;
						i/=10;
				 	}
			 }
			if(n==sum) {
			   	maker = i;
				break;
			}
			
		}
		System.out.println(maker);
	}

}
