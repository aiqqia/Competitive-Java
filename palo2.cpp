#include<bits/stdc++.h>
using namespace std;
 
int minPackets(int beans[], int m, int n)
{
    int dp[n+1];
    dp[0] = 0;
    for (int i=1; i<=n; i++)
        dp[i] = INT_MAX;
    for (int i=1; i<=n; i++)
    {
        for (int j=0; j<m; j++)
          if (beans[j] <= i)
          {
              int sub_res = dp[i-beans[j]];
              if (sub_res != INT_MAX && sub_res + 1 < dp[i])
                  dp[i] = sub_res + 1;
          }
    }
   
      if(dp[n]==INT_MAX)
        return -1;
   
    return dp[n];
}
 
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n, m;
        cin>>n>>m;
        int arr[m];
        for(int i = 0; i < m; i++)
            cin>>arr[i];
        int ans = minPackets(arr, m, n);
        if(ans == -1)
            cout<<"NO"<<endl;
        else   
            cout<<ans<<endl;
    }
        return 0;
}