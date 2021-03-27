#include <iostream>

using namespace std;

int main() {

	int arr[100];
	int max = 0;
	int num = 0;

	for (int i = 1; i < 10; i++) {
		cin >> arr[i];
		if (max < arr[i]) {
			max = arr[i];
			num = i;
		}
	}
	cout << max << endl << num;
	
}