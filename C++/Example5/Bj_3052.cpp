#include <iostream>

int main() {

    int rest[42] = {0,};
    int n;
    int cnt = 0;

    for (int i=0; i<10; i++) {
        std::cin >> n;
        rest[n % 42] = 1;
    }

    for (int i=0; i<42; i++) {
        cnt += rest[i];
    }

    std::cout << cnt;
}