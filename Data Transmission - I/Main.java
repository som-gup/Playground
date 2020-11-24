#include <bits/stdc++.h>
using namespace std;

int main() 
{
  long long int n, sum=0, rem, count = 0;;
  cin>>n;
  while(n)
  {
    rem = n%10;
    sum += rem * pow(2,count);
    n = n/10;
    count++;
  }
  cout<<sum;
}