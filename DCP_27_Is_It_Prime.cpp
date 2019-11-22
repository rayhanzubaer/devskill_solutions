#include <bits/stdc++.h>
using namespace std;

bool isPrime(int n) {
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

int main()
{
    int T;
    scanf("%d", &T);

    for (int t = 1; t <= T; t++) {
        int n;
        scanf("%d", &n);

        if (isPrime(n)) {
            printf("Yes\n");
        } else {
            printf("No\n");
        }
    }

    return 0;
}
