#include<bits/stdc++.h>
using namespace std;

bool prime(int n)
{
  if(n==1)
    return false;
  if(n==2||n==3)
    return true;
  if(n%2==0)
    return false;
  for(int i = 3; i<=sqrt(n); i=i+2)
  {
    if(n%i == 0)
      return false;
  }
  return true;
}
int main()
{
  int s, e, count = 0;
  cin>>s>>e;
  for(int i = s; i<=e-6; i++)
  {
    if(prime(i) && prime(i+6))
      count++;
  }
  if(count>0)
  {
    cout<<count;
  }
  else
  {
    cout<<"No Prime Pairs";
  }
}
