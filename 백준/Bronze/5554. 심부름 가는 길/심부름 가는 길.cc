#include <iostream>
using namespace std;

int main() {
    int H1, H2, H3, H4, Time;

    cin >> H1 >> H2 >> H3 >> H4;

    Time = H1 + H2 + H3 + H4;

    cout << Time / 60 << endl;
    cout << Time % 60;
    
    return 0;
}