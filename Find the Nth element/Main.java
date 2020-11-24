#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0; i<n; i++)
    cin>>a[i];
  int ele;
  cin>>ele;
  if(ele>n)
    cout<<"No node found";
  else
    cout<<a[ele-1];
}