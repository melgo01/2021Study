#include <iostream>

static int search (int arr[], int max) {
    int j=0;
    for (j=0; j<9; j++) {
        if (arr[j] == max) {
            return j+1;
        }
    }

    return -1;
}

int main() {
    int arr[9];

    for(int i=0; i<9; i++) {
        std::cin >> arr[i];
    }

    int max = arr[0];

    for(int i=0; i<9; i++) {
        if (max < arr[i]) max = arr[i];
    }

    std::cout << max <<"\n";
    std::cout << search(arr, max);
}

