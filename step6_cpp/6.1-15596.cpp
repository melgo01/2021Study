
#include <iostream>
#include <vector>
using namespace std;

long long sum(std::vector<int>&a)
{
    long x = 0;
    for (int i = 0; i < a.size(); i++) {
        x += a[i];
    }
    return x;
}
