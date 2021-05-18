#include <bits/stdc++.h>
using namespace std;

bool cmp(pair<char, int> a, pair<char, int> b)
{
  if(a.second == b.second)
    return a.first>b.first;
  return a.second<b.second;
}
int main() 
{
  int tests;
  cin>>tests;
  while(tests--)
  {
    string str;
    cin>>str;
    string alphas = "zyxwvutsrqponmlkjihgfedcba";
    int flag = 1;
    string strout = "";
    map<char, int> um;
    for(int i=0; i<str.length(); i++)
      um[str[i]]++;
    for(int i=0; i<alphas.length(); i++)
    {
      flag = 1;
      for(int j=0; j<str.length(); j++)
      {
        if(alphas[i] == str[j])
        {
          flag = 0;
          break;
        }
      }
      if(flag == 1)
        strout = strout + alphas[i];
    }
    vector<pair<char, int>> vec;
    for(auto x:um)
      vec.push_back(x);
    sort(vec.begin(), vec.end(), cmp);
    for(auto y:vec)
      strout = strout + y.first;
    for(int i=0; i<strout.length(); i++)
      cout<<strout[i]<<" ";
    cout<<endl;
  }
}