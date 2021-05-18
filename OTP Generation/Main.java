#include <iostream>
using namespace std;

int main() 
{
  int n, rem, prod = 1;;
  cin>>n;
  while(n)
  {
    rem = n%10;
    prod *= rem;
    n=n/10;
  }
  cout<<prod;
}