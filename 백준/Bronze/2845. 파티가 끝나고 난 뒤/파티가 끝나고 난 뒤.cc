#include <iostream>
using namespace std;

int main() {
    int P, A, PA;

    cin >> P >> A;

    PA = P * A;

    int q,w,e,r,t;

    cin >>  q >> w >> e >> r >> t;

    cout << q - PA << " " << w - PA << " " << e - PA << " " << r - PA << " " << t - PA;
    return 0;
}