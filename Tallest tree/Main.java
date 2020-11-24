#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n][2];
  for(int i=0; i<n; i++)
  {
    for(int j=0; j<2; j++)
      cin>>arr[i][j];
  }
  int heightarr[n];
  int count = 0;
  for(int i=0; i<n; i++)
  {
    heightarr[count++] = (arr[i][0]*12) + arr[i][1];
  }
  cout<<*max_element(heightarr, heightarr+n);
}