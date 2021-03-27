#include <iostream>
using namespace std;

int main() {
	int N;
	int sum = 0, sq = 0;
	string ox;
	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> ox;
		for (int j = 0; j < ox.length(); j++) {
			if (ox[j] == 'O') {
				++sq;
				sum += sq;
			} 
			else {
				sq = 0;
			} //if end
		} //for end(one line)		
		sq = 0;
		cout << sum << '\n';
		sum = 0;
	} //for end(all)
}