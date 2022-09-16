/*#include <bits/stdc++.h>
using namespace std;
int knapSack(int W, int wt[], int val[], int n)
{
    // making and initializing dp array
    int dp[W + 1];
    memset(dp, 0, sizeof(dp));
 
    for (int i = 1; i < n + 1; i++) {
        for (int w = W; w >= 0; w--) {
 
            if (wt[i - 1] <= w)
                // finding the maximum value
                dp[w] = max(dp[w],
                            dp[w - wt[i - 1]] + val[i - 1]);
        }
    }
    return dp[W]; // returning the maximum value of knapsack
}
int main()
{
    int val[] = { 25, 75, 15, 95, 80, 40, 35 };
    int wt[] = { 4, 12 ,2, 18, 15, 6, 5 };
    int W = 48;
    int n = sizeof(val) / sizeof(val[0]);
    cout << knapSack(W, wt, val, n);
    return 0;
}*/
#include <bits/stdc++.h>
using namespace std;
 
// we can further improve the above Knapsack function's space
// complexity
int knapSack(int W, int wt[], int val[], int n)
{
    int i, w;
    int K[2][W + 1];
    // We know we are always using the current row or
    // the previous row of the array/vector . Thereby we can
    // improve it further by using a 2D array but with only
    // 2 rows i%2 will be giving the index inside the bounds
    // of 2d array K
 
    for (i = 0; i <= n; i++) {
        for (w = 0; w <= W; w++) {
            if (i == 0 || w == 0)
                K[i % 2][w] = 0;
            else if (wt[i - 1] <= w)
                K[i % 2][w] = max(
                    val[i - 1]
                        + K[(i - 1) % 2][w - wt[i - 1]],
                    K[(i - 1) % 2][w]);
            else
                K[i % 2][w] = K[(i - 1) % 2][w];
        }
    }
    return K[n % 2][W];
}
 
// Driver Code
int main()
{
    int val[] = { 25, 75, 15, 95, 80, 40, 35 };
    int wt[] = { 4, 12 ,2, 18, 15, 6, 5 };
    int W = 48;
    int n = sizeof(val) / sizeof(val[0]);
 
    cout << knapSack(W, wt, val, n);
 
    return 0;
}
 