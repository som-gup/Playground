#include <bits/stdc++.h>
using namespace std;

bool prime(int n)
{
    if(n == 1)
    {
        return false;
    }
    if(n==2 || n==3)
    {
        return true;
    }
    if(n%2==0)
    {
        return false;
    }
    for(int i = 3; i<=sqrt(n); i = i+2)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
}
int main() 
{
  int start, end, sum = 0, rem, totalsum = 0, temp;
  cin>>start>>end;
  for(int i=start; i<=end; i++)
  {
    if(prime(i))
    {
      temp = i;
      while(temp)
      {
        rem = temp%10;
        sum = sum*10 + rem;
        temp = temp/10;
      }
      if(prime(sum))
      {
        totalsum = totalsum + i;
      }
      rem = 0;
      sum = 0;
    }
  }
  cout<<"sprime = "<<totalsum;
}