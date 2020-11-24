#include <bits/stdc++.h>
using namespace std;

bool prime(int n)
{
  if(n==2 || n==3)
    return true;
  if(n%2 == 0)
    return false;
  for(int i=3; i<=sqrt(n); i++)
  {
    if(n%i == 0)
      return false;
  }
  return true;
}
int main() 
{
  int n;
  cin>>n;
  for(int i=2; i<n; i++)
  {
    if(prime(i))
      cout<<i<<" ";
  }
}