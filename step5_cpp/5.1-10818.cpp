#include <iostream>
using namespace std;

int main() {

	int x, num, max = 0, min = 0;
	cin >> x >> num;
	max = num;
	min = num;


	for (int i = 1; i < x; i++) {
		cin >> num;
		if (num > max) max = num;
		if (num < min) min = num;
	}

	cout << min << " " << max << '\n';
}