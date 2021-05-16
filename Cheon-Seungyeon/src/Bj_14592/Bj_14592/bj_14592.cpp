#include<iostream>
#include<queue>
using namespace std;

struct Students {
	int num;
	int score;
	int attempt;
	int time;

	Students(int n, int s, int a, int t) : num(n), score(s), attempt(a), time(t) {}
};

struct cmp {
	bool operator()(Students s1, Students s2) {
		if (s1.score == s2.score) {
			if (s1.attempt == s2.attempt) {
				return s1.time > s2.time;
			}
			else {
				return s1.attempt > s2.attempt;
			}
		}
		else {
			return s1.score < s2.score;
		}
	}
};

int main() {
	int ns;
	int s, a, t;
	priority_queue<Students, vector<Students>, cmp> pq;
	
	
	
	cin >> ns;
	



	for (int i = 1; i <= ns; i++) {
		cin >> s;
		cin >> a;
		cin >> t;
		pq.push(Students(i, s, a, t));
	}

	std::cout << pq.top().num << endl;
	
	return 0;
}