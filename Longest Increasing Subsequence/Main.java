#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i = 0; i<n; i++)
  {
    cin>>arr[i];
  }
  int L[n];
  L[0] = 1;
  for(int i = 1; i<n; i++)
  {
    L[i] = 1;
    for(int j = 0; j<i; j++)
    {
      if(arr[i]>arr[j] && L[i] < L[j] + 1)
        L[i] = L[j] + 1;
    }
  }
  cout<<*max_element(L, L+n);
}