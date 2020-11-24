#include <iostream>
using namespace std;

int main() 
{
  int n1, n2;
  cin>>n1>>n2;
  int sum = 0, count = 0, r1, r2, carry = 0;
  while(n1&&n2)
  {
    r1 = n1%10;
    r2 = n2%10;
    sum = carry + r1 + r2;
    if(sum > 9)
    {
      carry = 1;
      count++;
    }
    else
    {
      carry = 0;
    }
    n1 = n1/10;
    n2 = n2/10;
  }
  cout<<count;
}