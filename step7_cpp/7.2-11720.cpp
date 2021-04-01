
#include <iostream>
using namespace std;

int main()
{
	int num;
	cin >> num;
	string str;
	cin >> str;
	int sum = 0;

	for (int i = 0; i < num; i++) {
		sum += str.at(i) - '0';
	}

	cout << sum << endl;
}