#include <iostream>
using namespace std;

int main() 
{
  int a,m,r;
  cin>>a>>m>>r;
  if(a>m)
    cout<<r-(a-m);
  else
    cout<<r+(m-a);
}