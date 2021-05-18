#include <bits/stdc++.h>
using namespace std;

int computeLCS(string s1, string s2, int m, int n)
{
  int L[m+1][n+1];
  for(int i = 0; i<=m; i++)
  {
    for(int j = 0; j<=n; j++)
    {
      if(i == 0 || j == 0)
        L[i][j] = 0;
      else if(s1[i - 1] == s2[j-1])
        L[i][j] = L[i - 1][j - 1] + 1;
      else
        L[i][j] = max(L[i-1][j], L[i][j-1]);
    }
  }
  return L[m][n];
}

int main() 
{
  string str1, str2;
  cin>>str1>>str2;
  int len1, len2;
  len1 = str1.length();
  len2 = str2.length();
  cout<<computeLCS(str1, str2, len1, len2);
}