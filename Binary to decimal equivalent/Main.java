#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int sum = 0, count = 0;
  while(n)
  {
    sum = sum + (n%10)*pow(2, count);
    count++;
    n=n/10;
  }
  cout<<sum;
}