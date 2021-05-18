#include <bits/stdc++.h>
using namespace std;

bool checkPalindrome(string s)
{
  int n;
  n = s.length();
  for(int i = 0; i<n; i++)
  {
    if(s[i]!=s[n - i -1])
      return false;
  }
  return true;
}
int main() 
{
  string str, str2;
  getline(cin, str);
  int len  = str.length();
  int count = 0;
  for(int i = 0; i<len; i++)
  {
    if(str[i] != ' ')
    {
      str2 = str2 + str[i];
      if(i == len - 1)
      {
        if(checkPalindrome(str2))
        {
          count++;
        }
      }
    }
    else 
    {
      if(checkPalindrome(str2))
      {
        count++;
      }
      str2 = "";
    }
  }
  cout<<count;
}