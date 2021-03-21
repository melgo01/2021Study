package step12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class J2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		//stringbuilder : 긴 문자열 더하는 상황에서 사용
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		//integer type의 array "list" 생성
		for(int i=0; i<N; i++) list.add(sc.nextInt());
		//add method: 순차적으로 array에 값 할당
		Collections.sort(list);
		//Collections.sort method: array의 원소를 사전식배열하여 array의 순서 변경
		for(int x : list) sb.append(x).append('\n');
		//stringbuilder의 메소드 append: 문자열 더하는 역할
		System.out.println(sb);
		sc.close();

	}

}
