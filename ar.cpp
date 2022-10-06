#include<bits\stdc++.h>
 
vector<int> balancedOrNot(vector<string> expressions, vector<int> maxReplacements)
{
    int n = expressions.size();
    vector<int> ans(n, 0);
    for(int i = 0; i < n; i++)
    {
        int cap = maxReplacements[i];
        string str = expressions[i];
        int open = 0, close = 0;
        int j = 0, len = str.size();
        while(j < len)
        {
            if(str[j] == '<')
                open++;
            else
                close++;
            if(close > open)
            {
                cap--;
                open++;
            }    
            j++;
        }
        if(open > close)
        {
            ans[i] = 0;
            continue;
        }
        else
        {
            int changes = close - open;
            if(changes <= cap)
            {
                ans[i] = 1;
            }
        }

    }
    return ans;
}


int main(){
    int x;
    int p = 12, p1 = 6 << 2;
    x = ~(~(!p++ << 2 << 3) || (p1 ^ 2 << 3) && p++ ^ 3 + (p1 >> 2 >> !0 * 2) || p && p1 <<2);
    cout << x;
}