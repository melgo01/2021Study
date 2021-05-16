#include <iostream>
#include <queue>
using namespace std;

struct Student {
    int num;
    int score;
    int time;
    int attempt;

    Student(int n, int s, int a, int t) : num(n), score(s), time(t), attempt(a) {}
};


struct compare {
    bool operator()(Student s1, Student s2) {
        if (s1.score == s2.score) {
            if (s1.attempt == s2.attempt)
                return s1.time > s2.time;
            else
                return s1.attempt > s2.attempt;
        }
        else
            return s1.score < s2.score;
    }
};

int main() {
    int ns; int s; int a; int t;

    priority_queue<Student, vector<Student>, compare>pq;
    cin >> ns;
    for (int i = 1; i <= ns; i++) {
        cin >> s;
        cin >> a;
        cin >> t;
        pq.push(Student(i, s, t, a));
    }

    cout << pq.top().num << endl;

}