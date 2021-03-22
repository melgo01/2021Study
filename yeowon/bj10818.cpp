#include <iostream>

int main() {
	
	int n;
	int max, min;

	std::cin >> n;

	int* ba = new int[n];

	for (int i = 0; i < n; i++) {
		std::cin >> ba[i];
	}

	max = ba[0];
	min = ba[0];

	for (int i = 1; i < n; i++) {
		if (max < ba[i]) {
			max = ba[i];
		}
		if (min > ba[i]) {
			min = ba[i];
		}
	}

	std::cout << min;
	std::cout << " ";
	std::cout << max;

}