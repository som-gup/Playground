#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
  {
    cin>>arr[i];
  }
  int ele;
  cin>>ele;
  int j;
  for(j=0; j<n; j++)
  {
    if(arr[j] == ele)
    {
      break;
    }
  }
  if(j<n)
    cout<<"index = "<<j;
  else
    cout<<"-1";
}