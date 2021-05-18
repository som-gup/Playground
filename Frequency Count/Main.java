#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  cin>>str;
  map<char, int> um;
  for(int i=0; i<str.length(); i++)
    um[str[i]]++;
  for(auto x:um)
  {
    cout<<x.first<<x.second;
  }
}