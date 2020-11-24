#include<iostream>
using namespace std;
int main()
{
  int m, rem = 0, sum = 0;
  cin>>m;
  while(m)
  {
    rem = m%10;
    sum = sum+rem;
    m=m/10;
  }
  cout<<"Alice must go in path-"<<sum;
}