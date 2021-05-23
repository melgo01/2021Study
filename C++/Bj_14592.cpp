//
//  Bj_14592.cpp
//  2021_GIST_DS
//
//  Created by 이지아 on 2021/05/16.
//

#include <iostream>
#include <queue>
using namespace std;

struct cmp {
    bool operator()(pair<int, pair<int, pair<int, int>>> &a, pair<int, pair<int, pair<int, int>>> &b) {
        int x = a.second.first;
        int y = b.second.first;
        if (x == y) {
            x = a.second.second.first;
            y = b.second.second.first;
            if (x == y) {
                x = a.second.second.second;
                y = b.second.second.second;
                return x > y;
            } else {
                return x > y;
            }
        } else {
            return x < y;
        }
    }
};

int main() {

    priority_queue<pair<int, pair<int, pair<int, int>>>, vector<pair<int, pair<int, pair<int, int>>>>, cmp> pq;
    
    int N;
    cin >> N;
    
    for (int i=1; i<=N; i++) {
        int a, b, c;
        
        cin >> a;
        cin >> b;
        cin >> c;
        
        pq.push({i,{a, {b, c}}});

    }

    cout << pq.top().first;

}
