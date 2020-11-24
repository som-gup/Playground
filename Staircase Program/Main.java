#include  <iostream>
using namespace std;
 
int staircount(long int n)
{
  long int fib[n+2];
  fib[0] = 0;
  fib[1] = 1;
  for(int i=2; i<=n; i++)
  {
    fib[i] = fib[i-1] + fib[i-2];
  }
  return fib[n];
}
 
int main ()
{
  long int n;
  cin>>n;
  cout<<staircount(n+1);
 
  return 0;
}
