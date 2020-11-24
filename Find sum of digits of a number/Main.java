#include <iostream>
using namespace std;

int main() 
{
  int n, rem = 0, sum = 0;
  cin>>n;
  while(n)
  {
    rem = n%10;
    sum = sum+rem;
    n=n/10;
  }
  std::cout<<sum;
  return 0;
}