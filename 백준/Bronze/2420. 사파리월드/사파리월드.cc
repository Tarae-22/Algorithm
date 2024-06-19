#include <iostream>
using namespace std;

int main() {
    long long int a , b, c;
    cin >> a >> b;

    c= a - b;

    if( c < 0){
        c = c * -1;
    }

    cout << c;

    return 0;
}