#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int L1,L2,L3;
  string str;
  cin>>L1>>L2>>L3>>str;
  if(str=="L1")
  {
    if(L2<L3)
      cout<<"L2";
    else
      cout<<"L3";
  }
  else if(str=="L2")
  {
    if(L1<L3)
      cout<<"L1";
    else
      cout<<"L3";
  }
  else if(str=="L3")
  {
    if(L1<L2)
      cout<<"L1";
    else
      cout<<"L2";
  }
}