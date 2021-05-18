#include <bits/stdc++.h>
using namespace std;

int main() 
{
  char n[100];
  cin>>n;
  int len;
  len = strlen(n);
  int num = 0;
  int sumodd = 0, sumeven = 0, diff;
  for(int i=0; i<len; i++)
  {
    if(i%2 == 0)
    {
      num = n[i] - 48;
      sumodd += num;
    }
    else
    {
      num = n[i] - 48;
      sumeven += num;
    }
  }
  diff = abs(sumodd - sumeven);
  cout<<diff;
}