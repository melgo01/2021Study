#include <iostream>

static double newScore(double a, double max) {
    return (a/max*100);
}

int main() {

    int n;
    std::cin >> n;
    double *arr;
    arr = (double *)malloc(sizeof(double) * n); // 크기가 n인 배열 만들기

    for (int i = 0; i < n; i++) {
        double j;
        std::cin >> j;
        arr[i] = j;
    } // 배열에 값 넣기

    double m = -1000000;

    for (int i = 0; i < n; i++) {
        if (arr[i] > m) {
            m = arr[i];
        }
    } // max 값 정하기

    for (int i = 0; i < n; i++) { 
        arr[i] = newScore(arr[i], m);
    } // 배열의 값을 바꾸고 sum에 더하기
    
    double sum = 0;
    for (int i=0; i<n; i++) {
         sum+=arr[i];
    }
    std::cout << sum/n; // 그 sum의 평균 출력

}
