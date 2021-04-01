#include <iostream>
#include <string>
using namespace std;

int main()
{
    string s;
    cin >> s;

    int index;
    for (char a = 'a'; a <= 'z'; a++) {
        index = s.find(a);
        cout << index << " ";
    }
    
    cout << endl;

}
