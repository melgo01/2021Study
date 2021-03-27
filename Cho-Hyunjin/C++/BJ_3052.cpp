#include <iostream>

using namespace std;

int main() {
	int arr[42] = { 0 };
	int num;
	int result = 0;
	
	for (int i = 0; i < 11; i++)
	{
		cin >> num;
		arr[num % 42] = 1;
	}

	for (int i = 0; i < 42; i++)
	{
		if (arr[i] == 1)
			result++;
	}
	cout << result << endl;
	return 0;
}