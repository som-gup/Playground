#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  int freqarr[n];
  int count = 0;
  map<int, int> um;
  for(int i=0; i<n; i++)
    um[arr[i]]++;
  for(auto x:um)
  {
    freqarr[count++] = x.second;
  }
  map<int, int> unim;
  for(int i=0; i<count; i++)
    unim[freqarr[i]]++;
  int uniquearr[n];
  int uniqcount = 0;
  for(auto x:unim)
  {
    uniquearr[uniqcount++] = x.first;
  }
  sort(uniquearr, uniquearr+uniqcount, greater<int>());
  for(int i=0; i<uniqcount; i++)
  {
    for(auto x:um)
    {
      if(x.second == uniquearr[i])
      {
        for(int j=0; j<uniquearr[i]; j++)
          cout<<x.first<<" ";
      }
    }
  }
}