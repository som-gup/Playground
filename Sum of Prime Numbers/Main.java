#include <bits/stdc++.h>
using namespace std;

bool prime(int n)
{
  if(n == 1)
    return false;
  if(n == 2 || n==3)
    return true;
  if(n%2 == 0)
    return false;
  for(int i=3; i<=sqrt(n); i = i+2)
  {
    if(n%i == 0)
      return false;
  }
  return true;
}
int main() 
{
  int a,b, sum = 0;
  cin>>a>>b;
  for(int i= a+1; i<b; i++)
  {
    if(prime(i))
      sum = sum + i;
  }
  cout<<sum;
}