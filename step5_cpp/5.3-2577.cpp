#include <iostream>
using namespace std;

int main(){
	int A, B, C;
	cin >> A >> B >> C;
	int num = A * B * C;
	int a[10] = { 0, };

	for (int i = 0; i < 10; i++) {
		while (num != 0) {
			if (num % 10 == i) { a[i]++; }
			num = num / 10;
		}
		num = A * B * C;
		cout << a[i] << '\n';
	}
}