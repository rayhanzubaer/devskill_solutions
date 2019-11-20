#include <bits/stdc++.h>
using namespace std;

int main()
{
    int T;
    scanf("%d", &T);

    for (int t = 1; t <= T; t++) {
        int cx, cy, px, py;
        double r;
        scanf("%d %d %lf %d %d", &cx, &cy, &r, &px, &py);

        double d = sqrt(pow(cx - px, 2) + pow(cy - py, 2));

        if (d > r) {
            printf("Case %d: Outside\n", t);
        } else if (d < r) {
            printf("Case %d: Inside\n", t);
        } else {
            printf("Case %d: OnCircle\n", t);
        }
    }

    return 0;
}
