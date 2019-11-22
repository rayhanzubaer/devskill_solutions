#include <bits/stdc++.h>
using namespace std;

int main()
{
    int T;
    scanf("%d", &T);

    for (int t = 1; t <= T; t++) {
        float r, s;
        scanf("%f %f", &r, &s);

        if (2 * r >= s * 1.41) {
            printf("Yes\n");
        } else {
            printf("No\n");
        }
    }

    return 0;
}
