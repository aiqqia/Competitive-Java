#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int arr[n];
        for(int i = 0; i < n; i++)
            cin>>arr[i];
        int prefix[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++)
            prefix[i] = arr[i] + prefix[i-1];

            
        for(int i = n-1; i >= 0; i--)
        {   
            int col = 0;
            if(i != 0)
                col = prefix[i-1];
            int row = arr[i];
            for(int j = 0; j < row; j++)
            {
                for(int k = 0; k < col; k++)
                {
                    cout<<"  ";
                }
                cout<<"* ";
                if(j == 0)
                {
                    int p = arr[i];
                    while(p--)
                        cout<<"* ";
                }
                cout<<endl;
            }
        }
        cout<<"* "<<endl;
    }
    return 0;
}