#include <iostream>
using namespace std;

int main() 
{
  int start, end;
  cin>>start>>end;
  int sum = 0;
  for(int i=start; i<=end; i++)
  {
    if(i%3 == 0 && i%5 == 0)
      sum = sum + i;
  }
  cout<<sum;
}