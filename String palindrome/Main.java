#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  cin>>str;
  string str2 = "";
  str2 = str;
  reverse(str.begin(), str.end());
  if(str2 == str)
    cout<<str2<<" is a palindrome";
  else
    cout<<str2<<" is not a palindrome";
}