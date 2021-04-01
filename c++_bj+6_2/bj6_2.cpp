#include<iostream>
#define N 10001

bool arr[N];
using namespace std;


int dn(int n) {
    int sum = n;  

    while (1) {   

        if (n == 0) break; 
        sum += n % 10;      
        n = n / 10;         

    }

    return sum;
}


int main() {
    int* a = new int[N];

    for (int i = 1; i < N; i++) {
        int n = dn(i);

        if (n <= N) {
            arr[n] = true;
        }

    }
 

    for (int i = 1; i < N; i++) {
        if (!arr[i]) printf("%d\n", i);
    }


    return 0;
}

