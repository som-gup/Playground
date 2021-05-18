#include<iostream>
using namespace std;
int main()
{
  int n,m, number, leftout;
  cin>>n>>m;
  number = n/m;
  leftout = n%m;
  cout<<"The number of friends in each team is "<<number<<" and left out is "<<leftout;
}