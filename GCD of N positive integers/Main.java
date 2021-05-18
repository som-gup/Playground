#include <bits/stdc++.h>
using namespace std;

bool gcdofnint(int n, int arr[], int len)
{
  for(int i=0; i<len; i++)
  {
    if(arr[i]%n != 0)
      return false;
  }
  return true;
}
int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  int gcd;
  gcd = *min_element(arr, arr+n);
  while(gcd != 1)
  {
    if(gcdofnint(gcd, arr, n))
    {
      break;
    }
    gcd--;
  }
  cout<<gcd;
}