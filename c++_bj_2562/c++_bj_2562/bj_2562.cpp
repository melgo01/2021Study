#include<iostream>
using namespace std;

int main() {
	int n = 9;
	int* arr = new int[n];
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	int max = arr[0];
	int ID;
	for (int i = 0; i < n; i++) {
		if (max < arr[i]) {
			max = arr[i];
			ID = i+1;
		}
	}
	cout << max << " " << ID << endl;
	delete[] arr;

	return 0;

}