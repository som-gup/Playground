#include <iostream>
using namespace std;

int returnMaxPowerOf2(int num)
{
  int count = 0;
  while(1)
  {
    if(num%2 == 0)
    {
      num = num/2;
      count++;
    }
    else
      break;
  }
  return count;
}
int main() 
{
  int start, end, powerof2, maxpower, maximumvalue;
  cin>>start>>end;
  for(int i=start; i<=end; i++)
  {
    powerof2 = returnMaxPowerOf2(i);
    if(powerof2 > maxpower)
    {
      maxpower = powerof2;
      maximumvalue = i;
    }
  }
  cout<<maximumvalue;
}