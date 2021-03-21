package step12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class J2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		//stringbuilder : �� ���ڿ� ���ϴ� ��Ȳ���� ���
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		//integer type�� array "list" ����
		for(int i=0; i<N; i++) list.add(sc.nextInt());
		//add method: ���������� array�� �� �Ҵ�
		Collections.sort(list);
		//Collections.sort method: array�� ���Ҹ� �����Ĺ迭�Ͽ� array�� ���� ����
		for(int x : list) sb.append(x).append('\n');
		//stringbuilder�� �޼ҵ� append: ���ڿ� ���ϴ� ����
		System.out.println(sb);
		sc.close();

	}

}
