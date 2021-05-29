// BJ_14592.cpp : 이 파일에는 'main' 함수가 포함됩니다. 거기서 프로그램 실행이 시작되고 종료됩니다.
//

#include <iostream>
#include <queue>
using namespace std;


struct Contest {
    int num;
    int sum;
    int count;
    int time;

    Contest(int n, int s, int c, int t) : num(n), sum(s), count(c), time(t) {
    }
};

struct cmp {
    bool operator()(Contest t, Contest u) {
        if (t.sum == u.sum) {
            if (t.count == u.count) {
                return t.time > u.time;
            }
            else {
                return t.count > u.count;
            }
        }
        else {
            return t.sum < u.sum;
        }
    }
};

int main()
{
    priority_queue<Contest, vector<Contest>, cmp> pq;

    int student;
    int n, s, c, t;

    cin >> student;

    for (int n = 1; n <= student; n++) {
        cin >> s >> c >> t;
        pq.push(Contest(n, s, c, t));
    }
    cout << pq.top().num << endl;

}
