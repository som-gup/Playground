#include <iostream>
using namespace std;

bool checkPalindrome(int num)
{
  int rem = 0, sum = 0;
  int val;
  val = num;
  while(val)
  {
    rem = val%10;
    sum = sum*10 + rem;
    val = val/10;
  }
  if(sum == num)
    return true;
  return false;
}
int main() 
{
  int start, end;
  cin>>start>>end;
  for(int i=start; i<=end; i++)
  {
    if(checkPalindrome(i))
    {
      cout<<i<<" ";
    }
  }
}