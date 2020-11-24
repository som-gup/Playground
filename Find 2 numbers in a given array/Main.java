#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  int a,b,i; 
  cin>>a>>b;
  for(i=0;i<n; i++)
    if(arr[i] == a)
    {
      cout<<"Element 1 index = "<<i;
      cout<<endl;
      break;
    }
  if(i == n)
  {
    cout<<"Element 1 index = -1";
    cout<<endl;
  }
  for(i=0;i<n; i++)
    if(arr[i] == b)
    {
      cout<<"Element 2 index = "<<i;
      cout<<endl;
      break;
    }
  if(i == n)
  {
    cout<<"Element 2 index = -1";
  }
}