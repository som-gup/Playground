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
  int pos;
  cin>>pos;
  for(int i=0; i<n; i++)
  {
    if(i != pos - 1)
      cout<<arr[i]<<" ";
  }
}