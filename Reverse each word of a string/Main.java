#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  getline(cin, str);
  string str2 = "";
  int len;
  len = str.length();
  for(int i=len-1; i>=0; i--)
  {
    if(str[i] == ' ')
    {
      reverse(str2.begin(), str2.end());
      cout<<str2<<" ";
      str2 = "";
    }
    else if(i==0)
    {
      str2 += str[i];
      reverse(str2.begin(), str2.end());
      cout<<str2;
    }
    else
      str2 += str[i]; 
  }
}