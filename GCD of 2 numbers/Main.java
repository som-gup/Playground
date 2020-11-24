#include <iostream>
using namespace std;

int main() 
{
  int a,b;
  cin>>a>>b;
  int small, gcd = 1;
  if(a<b)
    small = a;
  else 
    small = b;
  while(small!=1)
  {
    if(a%small == 0 && b%small == 0)
    {
      gcd = small;
      break;
    }
    small--;
  }
  cout<<gcd;
}