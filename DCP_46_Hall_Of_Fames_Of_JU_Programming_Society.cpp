#include<bits/stdc++.h>
using namespace std;

int main() {
    int T;
    scanf("%d", &T);

    for (int t = 1; t <= T; t++) {
        int a, b;
        scanf("%d %d", &a, &b);
        printf("%d\n", (a + b) / 2);
    }

    return 0;
}
