#include<iostream>
using namespace std;

int main() {
	int C, N;
	cin >> C;
	cout << fixed;
	cout.precision(3);

	for (int i = 0; i < C; i++) {
		int count = 0;
		float sum = 0.0f;
		cin >> N;
		int* arr = new int[N];

		for (int j = 0; j < N; j++) {
			cin >> arr[j];
			sum += arr[j];
		}
		float avr = sum / N;

		for (int j = 0; j < N; j++) {
			if (arr[j] > avr)
				count++;
		}
		cout << (float)count / N * 100 << "%" << endl;

		delete[] arr;
	}
}