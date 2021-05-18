#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int k;
  cin>>k;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  int sum = 0;
  sort(arr, arr+n, greater<int>());
  for(int i=0; i<k; i++)
    sum+=arr[i];
  cout<<sum;
}