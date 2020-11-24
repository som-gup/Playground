#include<iostream>
using namespace std;

int main()
{
  int n;
  cin>>n;
  if(n%2 == 0)
  {
    int count = n/2;
    int start = 1;
    for(int i=1; i<count; i++)
    {
      start *= 3;
    }
    cout<<start;
  }
  else
  {
    int count = n/2 + 1;
    int start = 1;
    for(int i=1; i<count; i++)
    {
      start *= 2;
    }
    cout<<start;
  }
}