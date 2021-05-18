#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  string arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  map<string, int> um;
  for(int i=0; i<n; i++)
  {
    um[arr[i]]++;
  }
  for(auto x:um)
    cout<<x.first<<" "<<x.second<<endl;
}