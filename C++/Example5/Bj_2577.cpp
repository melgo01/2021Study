#include <iostream>

int main() {
    int a, b, c;
    int arr[10] = {0, };

    std::cin >> a;
    std::cin >> b;
    std::cin >> c;
    int n = a*b*c;

    while (n != 0) {
        arr[n%10]+=1; // 곱해서 나온 값의 10으로 나눈 나머지의 인덱스에 1 더해주기. 
        n = n/10; // 나누고 남은 걸 n에 대입하기.
    }

    for(int i = 0; i < 10; i++) {
        std::cout << arr[i] << "\n";
    }
}