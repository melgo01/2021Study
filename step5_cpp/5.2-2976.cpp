#include <iostream>
using namespace std;

int main() {
	int num[9];
	for (int i = 0; i < 9; i++) { cin >> num[i]; }
	int max = 0;
	int index = 0;
	for (int i = 0; i < 9; i++) {
		if (num[i] >= max) {
			max = num[i];
			index = i;
		}
	}
	++index;
	cout << max << "\n" << index << '\n';
}

/*
* import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		for(int i=0; i<9; i++) {	num[i] = sc.nextInt();	}
		int max = 0;
		int index = 0;
		for(int i=0; i<9; i++) {
			if(num[i]>=max) {
				max = num[i];
				index = i;
			}
		}
		++index;
		System.out.println(max+"\n"+index);
		sc.close();
	}

}
*/