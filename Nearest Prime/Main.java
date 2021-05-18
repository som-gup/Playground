#include <bits/stdc++.h>
using namespace std;

bool prime(long long int n)
{
  if(n==1)
    return false;
  if(n==2 || n==3)
    return true;
  if(n%2==0)
    return false;
  for(long long int i=3; i<=sqrt(n); i=i+2)
  {
    if(n%i==0)
      return false;
  }
  return true;
}
int main() 
{
  long long int tests;
  cin>>tests;
  while(tests--)
  {
    long long int range, i, j;
    cin>>range;
    for(i = range, j = range;;i--, j++)
    {
      if(i>=0 && prime(i))
      {
        cout<<i<<endl;
        break;
      }
      else if(prime(j))
      {
        cout<<j<<endl;
        break;
      }
    }
  }
}