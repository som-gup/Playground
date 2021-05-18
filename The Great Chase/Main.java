#include<iostream>
using namespace std;

int main()
{
  int tests;
  cin>>tests;
  while(tests--)
  {
    int startdist, zoron, zandar, k, s = 1, leaps = 0;
    cin>>startdist>>zoron>>zandar;
    int flag = 0;
    while(s!=0)
    {
      startdist = startdist+zoron;
      for(k=2; k<=zandar; k++)
      {
        if(startdist%k==0 && zandar%k==0)
          flag++;
      }
      if(flag == 0)
      {
        cout<<"-1"<<endl;
        break;
      }
      s = startdist%zandar;
      if(s==0)
      {
        leaps = startdist/zandar;
        cout<<leaps<<endl;
      }
    }
    }
  }