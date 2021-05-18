#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int n1 = 1;
  int n2 = 2;
  if(n == 1)
    cout<<n1;
  else if(n == 2)
    cout<<n2;
  else if(n>30)
    cout<<"Invalid Input";
  else
  {
    int n3 = 0;
    for(int i=3;i<=n; i++)
    {
      n3 = n2+n1;
      n1 = n2;
      n2 = n3;
    }
    cout<<n3;
  }
}