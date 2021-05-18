#include <bits/stdc++.h>
using namespace std;

bool checkPalindrome(string s, int i, int j)
{
  while(i<j)
  {
    if(s[i] != s[j])
      return false;
    i++;
    j--;
  }
  return true;
}

int main() 
{
  string str;
  cin>>str;
  int len = str.length();
  int i;
  for(i=0; i<len; i++)
  {
    if(checkPalindrome(str, i, len-1))
      break;
  }
  for(int j=i-1; j>=0; j--)
    cout<<str[j];
}