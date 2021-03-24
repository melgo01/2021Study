#include <iostream>
using namespace std;

int main() {
	int a[10];
	int b[42] = { 0, };
	int count=0;
	for (int i = 0; i < 10; i++) {
		cin >> a[i];
		a[i] = a[i] % 42;
		b[ a[i] ]++;
	}
	for (int i = 0; i < 42; i++) {
		if (b[i] != 0) count++;
	}
	cout << count << '\n';
}