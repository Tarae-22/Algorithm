#include <iostream>
using namespace std;

int main() {
    int T, N, M;

    cin >> T;

    for(int i = 0; i < T; i++){
        cin >> N >> M;

        int a = 1;
        for(int j = 0; j < N; j++)
        {
            a = a * (M - j);
            a = a / (1 + j);
        }

        cout << a << endl;
    }

    return 0;
}