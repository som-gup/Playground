#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  map<int, int> um;
  for(int i=0; i<n; i++)
    um[arr[i]]++;
  for(auto x:um)
  {
    if(x.second == 1)
      cout<<x.first<<" ";
  }
}