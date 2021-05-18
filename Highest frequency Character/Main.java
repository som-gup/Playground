#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  getline(cin, str);
  map<char, int> um;
  transform(str.begin(), str.end(), str.begin(), ::toupper);
  for(int i=0; i<str.length(); i++)
  {
    if(str[i] != ' ')
      um[str[i]]++;
  }
  string ch = "";
  int max = INT_MIN;
  for(auto x:um)
  {
    if(x.second > max)
    {
      max = x.second;
      ch = x.first;
    }
  }
  cout<<"Maximum occurring character is '"<<ch<<"'"<<" = "<<max<<" times.";
}