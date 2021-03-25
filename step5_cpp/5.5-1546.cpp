#include <iostream>
using namespace std;

int main() {
	int N, x;
	int M = 0;
	double sum = 0;
	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> x;
		sum += x;
		if (x >= M) M = x;
	}

	double avg = sum / (double)M / (double)N * 100;
	cout << avg << '\n';

}