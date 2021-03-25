#include<iostream>
using namespace std;

int main() {
	int a, b, c;
	cin >> a;
	cin >> b;
	cin >> c;

	int n = a * b * c;

	int arr[10] = { 0, };
	
	while (true) {
		for (int i = 0; i < 10; i++) {
			if (n % 10 == i){
				arr[i]+=1;
				}
			}
		n /= 10;
		if (n == 0) {
			break;
		}
	}
	for (int i = 0; i < 10; i++) {
		cout << arr[i] << endl;
	}
	
	
}