#include <bits/stdc++.h>
using namespace std;

int lps(string s1, string s2, int m, int n)
{
  int L[m+1][n+1];
  for(int i = 0; i<=m; i++)
  {
    for(int j = 0; j<=n; j++)
    {
      if(i == 0 || j==0)
        L[i][j] = 0;
      else if(s1[i-1] == s2[j-1])
        L[i][j] = L[i-1][j-1] + 1;
      else
        L[i][j] = max(L[i-1][j], L[i][j-1]);
    }
  }
  return L[m][n];
}

int main() 
{
  string str;
  cin>>str;
  string str2 = "";
  str2 = str;
  reverse(str.begin(), str.end());
  int len1, len2;
  len1 = str2.length();
  len2 = str.length();
  cout<<lps(str2, str, len1, len2) - 1;
}