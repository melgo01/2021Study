package bj_2798;
import java.util.Scanner;
public class bj_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int result=brutef(arr,n,m);
			System.out.println(result);
			
		}
	
	static int brutef(int[] arr,int n,int m) {
		int result =0;
		int subs=m;
		
		for(int i=0;i<n-2;i++) {
			int a=arr[i];
			for(int j=i+1;j<n-1;j++) {
				int b=arr[j];
				for(int k=i+2;k<n;k++) {
					int c =arr[k];
					int sum=a+b+c;
					if(sum==m) {
						return sum;
					}else {
					if(subs>Math.abs(sum-m)) {
						subs=Math.abs(sum-m);
						result=sum;
							
					}
					}
				
				}
			}
			
		}
		return result;
	

	}

}
