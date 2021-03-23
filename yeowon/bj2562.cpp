#include <iostream>

int main() {

	int ba[9];
	int max, idx;

	for (int i = 0; i < 9; i++) {
		std::cin >> ba[i];
	}
	max = ba[0];
	idx = 1;

	for (int i = 0; i < 9; i++) {
		if (max < ba[i]) {
			max = ba[i];
			idx = i+1;
		}
	}

	std::cout << max << '\n';
	std::cout << idx;

}