#include <iostream>

int main() {
    int n;
    std::cin >> n;
    int arr[n];
    std::fill_n(arr, n, 0); // arr이라는 길이가 n인 배열을 0으로 채우기.
    
    int max = -1000000;
    int min = 1000000;

    for (int i = 0; i < n; i++) {
        std::cin >> arr[i];
        if (arr[i] > max) max = arr[i];
        if (arr[i] < min) min = arr[i];
    }

    std::cout<<min<<' '<<max;

}

// 백준에서는 코드가 잘 돌아갔는데 이상하게 vscode에서는 실행이 안 됩니다.. 왠지 모르겠네요...
