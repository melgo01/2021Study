#include <iostream>

int main() {
    int n;
    std::cin >> n;
    int arr[n];
    std::fill_n(arr, n, 0);
    
    int max = -1000000;
    int min = 1000000;

    for (int i = 0; i < n; i++) {
        std::cin >> arr[i];
        if (arr[i] > max) max = arr[i];
        if (arr[i] < min) min = arr[i];
    }

    std::cout<<min<<' '<<max;

}

