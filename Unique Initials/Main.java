#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  cin>>str;
  int count = 0;
  map<char, int> um;
  for(int i=0; i<str.length(); i++)
  {
    um[str[i]]++;
  }
  for(auto x:um)
  {
    if(x.second == 1)
      count++;
  }
  cout<<count;
}