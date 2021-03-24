#include<iostream>

int main() {
	int a, b, c, n, digit = 1;
	int tem;
	int num[10] = { 0 };

	std::cin >> a;
	std::cin >> b;
	std::cin >> c;

	n = a * b * c;

	while (n >= 10) {
		tem = n % 10;
		num[tem]++;
		n /= 10;
	}
	num[n]++;
	
	for (int i = 0; i <= 9; i++) {
		std::cout << num[i] << std::endl;
	}
	
}