#include <iostream>
#include <string.h>

int main() {

    int n;
    std::cin >> n;

    char arr[79] = {0};
    int bonus, sum;

    for (int i = 0; i < n; i++) {
        bonus = 0;
        sum = 0;
        std::cin >> arr;
        for (int j = 0; j < strlen(arr); j++) {
            if (arr[j] == 'O') {
                bonus++;
                sum += bonus;
            } else bonus = 0;
        }
        std::cout << sum << "\n";
    }
}