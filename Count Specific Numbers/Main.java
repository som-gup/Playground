#include<bits/stdc++.h>
using namespace std;
bool checkDigit(int n)
{
  while(n)
  {
    if(n%10 != 1 && n%10 != 4 && n%10 != 9)
      return false;
    else
      n=n/10;
  }
  return true;
}
int CountSpecificNumber(int m,int n)
{
  int count = 0;
  for(int i=m; i<=n; i++)
  {
    if(checkDigit(i))
      count++;
  }
  return count;
}
int main()
{
  int m,n;
  cin>>m>>n;
  if(m>n)
    cout<<"-1";
  else
    cout<<CountSpecificNumber(m,n);
  return 0;
}
