#include<bits/stdc++.h>
using namespace std;

int fact(int n)
{
  int prod = 1;
  for(int i=2; i<=n; i++)
    prod = prod*i;
  return prod;
}
int nCr(int n, int r)
{
  return fact(n)/(fact(r)*fact(n-r));
}
int main()
{
  int lines, count = 0, sum = 0;
  cin>>lines;
  int angles[lines];
  int arr[lines];
  for(int i=0; i<lines; i++)
  {
    cin>>angles[i];
  }
  unordered_map<int, int> anglecount = {};
  for(int i=0; i<lines; i++)
  {
    anglecount[angles[i]]++;
  }
  for(auto x:anglecount)
  {
    if(x.second>=2)
    {
      arr[count++] = nCr(x.second, 2);
    }
  }
  for(int i=0; i<count; i++)
  {
    for(int j=i+1; j<count; j++)
    {
      sum = sum + arr[i]*arr[j]; 
    }
    
  }
  cout<<sum;
  return 0;
}