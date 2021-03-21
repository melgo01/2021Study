package step11;

import java.util.Scanner;

public class Decomposition2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum=0;
		int x=0;
		
		for(int num=1; num<N; num++) {
			x = num;	
			for(int i=0; i<7; i++) {
				sum += (x%10)*(Math.pow(10,i)+1);
				x /= 10;
				if(x==0) break;
			} //부분합 end
			
			if(sum==N) {
				System.out.println(num);
				break;
			} else { sum=0;}//부분합 성립하면 end
			
		} //모든 숫자 검증 end
		
		if(sum!=N) System.out.println("0");
		sc.close();
		
	} //main end

} //class end//clear!