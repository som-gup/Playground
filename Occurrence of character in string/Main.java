#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  getline(cin, str);
  map<char, int> um;
  int max = 0;
  char ch;
  for(int i=0; i<str.length(); i++)
    um[str[i]]++;
  for(auto x:um)
  {
    if(x.second > max)
    {
      max = x.second;
      ch = x.first;
    }
  }
  cout<<ch;
}