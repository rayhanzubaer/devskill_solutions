#include <bits/stdc++.h>
using namespace std;

int main()
{
    int T;
    scanf("%d", &T);

    float ab, bc, cd;

    for (int x = 0; x < T; x++) {

        scanf("%f %f %f", &ab, &bc, &cd);
        float ac = sqrt(ab * ab + bc * bc);
        float ad = sqrt(ac * ac + cd * cd);
        printf("%.2f\n", ad);
    }

    return 0;
}
