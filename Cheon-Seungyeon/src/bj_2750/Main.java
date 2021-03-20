package bj_2750;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int temp;
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i = 0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
				temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
			}
		}
		
		for(int val: arr) {
			System.out.println(val);
		}
	}

}
