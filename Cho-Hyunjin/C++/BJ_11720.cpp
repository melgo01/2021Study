#include <iostream>
using namespace std;

int main() {
	int n;
	char c;

	cin >> n;
	int sum = 0;

	for (int i = 0; i < n; i++) {
		cin >> c;
		sum += c - 48;
	}

	cout << sum << endl;

	return 0;

}