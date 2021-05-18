#include<iostream>
using namespace std;
int main()
{
  int n, start = 6;
  cin>>n;
  for(int i = 0; i<n; i++)
  {
    start = start + i*5;
    cout<<start<<" ";
  }
}