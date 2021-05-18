#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  cin>>str;
  string str2 = "";
  int i,j;
  for(i=0; i<str.length(); i++)
  {
    for(j=0; j<i; j++)
    {
      if(str[i] == str[j])
        break;
    }
    if(i == j)
      str2 = str2+str[i];
  }
  reverse(str2.begin(), str2.end());
  cout<<str2;
}