#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  int newarr[n];
  for(int i=0; i<n; i++)
  {
    newarr[arr[i]] = i;
  }
  for(int i=0; i<n; i++)
    cout<<newarr[i]<<" ";
}