#include <iostream>
using namespace std;

int main() 
{
  int f, l, n;
  cin>>f>>l>>n;
  int count = 0, val;
  for(int i=f; i<=l; i++)
  {
    val = i;
    while(val)
    {
      if(val%10 == n)
        count++;
      val=val/10;
    }
  }
  cout<<count;
}